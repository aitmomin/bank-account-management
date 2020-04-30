/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.web;

import com.banque.dao.CompteDao;
import com.banque.dao.ICompteDao;
import com.banque.dao.IOperationDao;
import com.banque.dao.OperationDao;
import com.banque.model.Compte;
import com.banque.model.Operation;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aitmomin
 */
@WebServlet(name = "operationServlet", urlPatterns = {"/operationServlet"})
public class operationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        double montant = Double.parseDouble(request.getParameter("montant"));
        String type = request.getParameter("opert");
        Date d = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String date = dt.format(d);
        String idCompte="";
        if ("Virement".equals(type)) {
            idCompte = request.getParameter("numcpt");
        } else {
            idCompte = request.getParameter("numerocpt");
        }
        
        ICompteDao cpt = new CompteDao();
        Compte cp = cpt.chercher(idCompte);
        Operation op = new Operation(date,montant,type,cp);
        IOperationDao iop = new OperationDao();
        iop.ajouter(op);
        request.getRequestDispatcher("homeServletOperation").forward(request, response);
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
