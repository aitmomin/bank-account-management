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
public class CompteCourant extends Compte{
    private double decouvert;

    public CompteCourant(String code, Date dateCreation, double solde, Client client, double decouvert) {
        super(code, dateCreation, solde, client);
        this.decouvert = decouvert;
    }

    public CompteCourant(Date dateCreation, double solde, Client client, double decouvert) {
        super(dateCreation, solde, client);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "decouvert=" + decouvert + '}';
    }
    
}
