/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.dao;

import com.banque.model.Client;
import com.banque.model.Compte;
import com.banque.model.CompteCourant;
import com.banque.model.Operation;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aitmomin
 */
public class test {
    public static void main(String[] args) throws ParseException, IOException {
        ICompteDao d = new CompteDao();
        System.out.println(d.compteExiste("cc"));
    }
}
