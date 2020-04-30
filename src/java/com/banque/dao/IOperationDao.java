/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import com.banque.model.Operation;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public interface IOperationDao {
    void ajouter(Operation op);
    List<Operation> getOperations(String idCompte);
}
