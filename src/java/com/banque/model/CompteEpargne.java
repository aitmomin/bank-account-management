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
public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne(String code, Date dateCreation, double solde, Client client, double taux) {
        super(code, dateCreation, solde, client);
        this.taux=taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public CompteEpargne(Date dateCreation, double solde, Client client, double taux) {
        super(dateCreation, solde, client);
        this.taux = taux;
    }
    
    
}
