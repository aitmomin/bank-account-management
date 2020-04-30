<%-- 
    Document   : home
    Created on : 30 déc. 2017, 16:06:48
    Author     : aitmomin
--%>

<%@page import="com.banque.dao.CompteDao"%>
<%@page import="com.banque.dao.ICompteDao"%>
<%@page import="com.banque.model.Operation"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='css/bootstrap.min.css'>
        <link rel='stylesheet' href='css/design.css'>
        <link rel='stylesheet' href='css/sweetalert.css'>
        <link rel='stylesheet' href='css/bootstrapValidator.css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="js/validator.js"></script>
        <script src="js/validator.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
        <div class="jumbotron text-center">
            <br/>
            <h1>Gestion des Comptes Bancaire</h1>   
            <br/>      
        </div>

        <div class="container">
            <br/><br/>
            <div class="col-sm-4">
                
            </div>
            <div class="col-sm-4" id="erreur">
                <div class="alert alert-danger" id="erreur-compte">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
                    <strong>Erreur !</strong> Compte Introuvable.
                </div>
                <form class="form-check" method="GET" action="homeServletInfo" id="valide">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
                        <input type="text" class="form-control" name="chercher" placeholder="numéro de compte" id="validationCustom04" required> 
                    </div>
                    <br/>
                    <div class="col-sm-4">

                    </div>
                    <div class="col-sm-2">
                        <div >
                            <button type="submit" class="btn btn-primary" >Chercher</button>
                        </div>
                    </div>
                    <br/><br/><br/>
                </form>
                <br/><br/><br/>
                <script src="js/jquery.js"></script>
                <script type="text/javascript">
                        (function() {
                            'use strict';

                            window.addEventListener('load', function() {
                              var form = document.getElementById('valide');
                              form.addEventListener('submit', function(event) {
                                if (form.checkValidity() === false) {
                                  event.preventDefault();
                                  event.stopPropagation();
                                }
                                form.classList.add('was-validated');
                              }, false);
                            }, false);
                          })(); 
                </script>
                
            </div>
                 
        </div> 
        
    </body>
</html>
