 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import com.banque.model.Compte;
import com.banque.model.CompteCourant;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public class CompteDao implements ICompteDao {

    @Override
    public void ajouter(Compte cp) {

    }
    
    public CompteCourant chercher(String idCompte) {
        CompteCourant cl = null;
        try {
            Connection c = ConnectManager.getInstance().getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT c.idCompte, c.idClient, DateCreation, Solde, decouvert\n" +
                                            "FROM compte c, client cl, comptecourant cc\n" +
                                            "WHERE c.idClient=cl.idClient\n" +
                                            "	and c.idCompte=cc.idCompte\n" +
                                            "	and c.idCompte like '"+idCompte+"'");
                rs.next();
                String code = rs.getString("idCompte");
                Date dateCreation = rs.getDate("dateCreation");
                double solde = rs.getDouble("solde");
                String idclient = rs.getString("idClient");
                double decouvert = rs.getDouble("decouvert");
                IClientDao cli = new ClientDao();
                Client client = cli.chercher(idclient);
                
                cl = new CompteCourant(code,dateCreation,solde,client,decouvert);    
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        
        return cl;
    }
  
    @Override
    public String chercherClient(String idCompte) {
        String client = null;
        try {
            Connection c = ConnectManager.getInstance().getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT idClient FROM compte WHERE idCompte like '"+idCompte+"'");
                rs.next();
                client = rs.getString("idClient");  
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        return client;
    }

    @Override
    public boolean compteExiste(String idCompte) {
        boolean existe = false;
        try {
            Connection c = ConnectManager.getInstance().getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT count(*) as nombre FROM compte WHERE idCompte like '"+idCompte+"'");
            rs.next();
            int nombre = rs.getInt("nombre");
            if (nombre == 0) {
                existe=false;
            }else{
                existe=true;
            }
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());           
        }   
        return existe;
    }

    @Override
    public List<Compte> getComptes(String idCompte) {
        List<Compte> list = new ArrayList<Compte>();
        try {
            Connection c = ConnectManager.getInstance().getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT idCompte" +
                                            "FROM compte " +
                                            "WHERE idCompte <> '"+idCompte+"'");
            while(rs.next()){
                String code = rs.getString("idCompte");
                Compte op = new Compte(code);
                list.add(op);
            }
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        
        return list;
    }

}
