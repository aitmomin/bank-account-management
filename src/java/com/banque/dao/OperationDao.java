/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import com.banque.model.Compte;
import com.banque.model.Operation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public class OperationDao implements IOperationDao{

    @Override
    public void ajouter(Operation op) {
        try {
            Connection conn = ConnectManager.getInstance().getConnection();
            PreparedStatement req = conn.prepareStatement("insert into operation values(NULL, ?, ?, ?, ?)");
            req.setString(1, op.getCompte().getCode());
            req.setString(2, op.getDateOperation());
            req.setDouble(3, op.getMontant());
            req.setString(4, op.getType());
            req.execute();
        }
        catch(Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
    
    @Override
    public List<Operation> getOperations(String idCompte) {
        List<Operation> list = new ArrayList<Operation>();
        try {
            Connection c = ConnectManager.getInstance().getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT idOperation,DateOperation,Montant,Type,o.idCompte \n" +
                                            "FROM operation o,compte c   \n" +
                                            "WHERE o.idCompte=c.idCompte\n" +
                                            "	and o.idCompte like '"+idCompte+"'");
            while(rs.next()){
                int code = rs.getInt("idOperation");
                String dateOperation = rs.getString("dateOperation");
                double montant = rs.getDouble("montant");
                String type = rs.getString("type");
                String idcompte = rs.getString("idCompte");
                ICompteDao cpt = new CompteDao();
                Compte cptt = cpt.chercher(idcompte);
                Operation op = new Operation(code,dateOperation,montant,type,cptt);
                list.add(op);
            }
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        
        return list;
    }
    
}
