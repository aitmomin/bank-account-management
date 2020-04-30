/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public class ClientDao implements IClientDao{

    @Override
    public void ajouter(Client c) {
        
    }

        @Override
    public Client chercher(String idClient) {
        Client cl = null;
        try {
            Connection c = ConnectManager.getInstance().getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from client where idClient like '"+idClient+"'");
                rs.next();
                String code = rs.getString("idClient");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                String image = rs.getString("image");
                String dateNaiss = rs.getString("dateNaiss");
                cl = new Client(code,nom,prenom,email,tel,dateNaiss,image);    
        } catch (Exception e) {
            System.out.println("Erreur : "+e.getMessage());
        }
        
        return cl;
    }
    
}
