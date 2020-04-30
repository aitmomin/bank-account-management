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
public class Operation {
    private int code;
    private String dateOperation;
    private double montant;
    private String type;
    private Compte compte;

    public Operation(int code, String dateOperation, double montant, String type, Compte compte) {
        this.code = code;
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.type = type;
        this.compte = compte;
    }

    public Operation(String dateOperation, double montant, String type, Compte compte) {
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.type = type;
        this.compte = compte;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String toString() {
        return "Operation{" + "code=" + code + ", dateOperation=" + dateOperation + ", montant=" + montant + ", type=" + type + ", compte=" + compte + '}';
    }
    
}
