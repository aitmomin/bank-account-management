/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import com.banque.model.Compte;
import com.banque.model.CompteCourant;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public interface ICompteDao {
    void ajouter(Compte cp);
    List<Compte> getComptes(String idCompte);
    CompteCourant chercher(String idCompte);
    String chercherClient(String idCompte);
    boolean compteExiste(String idCompte);
}
