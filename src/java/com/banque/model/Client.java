/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.model;

/**
 *
 * @author aitmomin
 */
public class Client {
    private String code;
    private String nom,prenom,email,tel,dateNaiss,image;

    public Client(String code, String nom, String prenom, String email, String tel, String dateNaiss, String image) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.dateNaiss = dateNaiss;
        this.image = image;
    }

    public Client(String nom, String prenom, String email, String tel, String dateNaiss, String image) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.dateNaiss = dateNaiss;
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Client{" + "code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", tel=" + tel + ", dateNaiss=" + dateNaiss + ", image=" + image + '}';
    }
    
}
