/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banque.web;

import com.banque.dao.ClientDao;
import com.banque.dao.CompteDao;
import com.banque.dao.IClientDao;
import com.banque.dao.ICompteDao;
import com.banque.dao.IOperationDao;
import com.banque.dao.OperationDao;
import com.banque.model.Client;
import com.banque.model.Compte;
import com.banque.model.CompteCourant;
import com.banque.model.Operation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aitmomin
 */
@WebServlet(name = "homeServletOperation", urlPatterns = {"/homeServletOperation"})
public class homeServletOperation extends HttpServlet {

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
        IOperationDao op = new OperationDao();
        String id = request.getParameter("numerocpt");
        List<Operation> listes = op.getOperations(id);      
        request.setAttribute("operations", listes);
        
        ICompteDao cpt = new CompteDao();     
        IClientDao idCli = new ClientDao();
                
        Client cli = idCli.chercher(cpt.chercherClient(id));
        request.setAttribute("codecli", cli.getCode());
        request.setAttribute("nomcli", cli.getNom());
        request.setAttribute("prenomcli", cli.getPrenom());
        request.setAttribute("emailcli", cli.getEmail());
        request.setAttribute("telcli", cli.getTel());
        request.setAttribute("datecli", cli.getDateNaiss());
        request.setAttribute("imagecli", cli.getImage());
        
        CompteCourant p = cpt.chercher(id);
        request.setAttribute("codecpt", p.getCode());
        request.setAttribute("datecpt", p.getDateCreation());
        request.setAttribute("soldecpt", p.getSolde());
        request.setAttribute("decouvert", p.getDecouvert());
        
        request.getRequestDispatcher("homeInfo.jsp").forward(request, response);
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
