/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public interface IClientDao {
    void ajouter(Client p);
    Client chercher(String idClient);
}
