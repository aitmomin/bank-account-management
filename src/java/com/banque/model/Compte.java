/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.model;

import java.util.Date;

/**
 *
 * @author aitmomin
 */
public class Compte {
    private String code;
    private Date dateCreation;
    private double solde;
    private Client client;

    public Compte(String code, Date dateCreation, double solde, Client client) {
        this.code = code;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }
    
    public Compte(String code) {
        this.code = code;
    }

    public Compte(Date dateCreation, double solde, Client client) {
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Compte{" + "code=" + code + ", dateCreation=" + dateCreation + ", solde=" + solde + ", client=" + client + '}';
    }
    
    
}
