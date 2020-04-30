<%-- 
    Document   : homeInfo
    Created on : 31 déc. 2017, 16:59:52
    Author     : aitmomin
--%>

<%@page import="com.banque.model.Compte"%>
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
        <link rel='stylesheet' href='css/bootstrap.min.css'>
        <link rel='stylesheet' href='css/bootstrapValidator.css'>

        <script src="js/validator.js"></script>
        <script src="js/validator.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <title>JSP Page</title>
    </head>
    <body>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
        <div class="jumbotron text-center">
            <h1>Compte Bancaire</h1>

        </div>

        <div class="container">
            <div class="row">
                <div class="col-sm-4" id="personne">
                    <div class="card" style="width:220px">
                        <div id="image">
                            <img src="images/<%=request.getAttribute("imagecli") %>" class="img-thumbnail" alt="Image Client" width="100" height="100" />
                        </div>
                        <div class="card-body">
                            <br/>  
                            <p class="card-text">=> Code : <strong><%=request.getAttribute("codecli") %></strong></p>
                            <p class="card-text">=> Nom : <strong><%=request.getAttribute("nomcli") %></strong></p>
                            <p class="card-text">=> Prenom : <strong><%=request.getAttribute("prenomcli") %></strong></p>
                            <p class="card-text">=> Email : <strong><%=request.getAttribute("emailcli") %></strong></p>
                            <p class="card-text">=> Phone : <strong><%=request.getAttribute("telcli") %></strong></p>
                            <p class="card-text">=> Date Naissance : <strong><%=request.getAttribute("datecli") %></strong></p>
                            <p class="card-text"><strong> - - - - - - - - Compte - - - - - - - - -</strong></p>
                            <p class="card-text">=> Code : <strong><%=request.getAttribute("codecpt") %></strong></p>
                            <p class="card-text">=> Date Création : <strong><%=request.getAttribute("datecpt") %></strong></p>
                            <p class="card-text">=> Solde : <strong><%=request.getAttribute("soldecpt") %></strong></p>
                            <p class="card-text">=> Decouvert : <strong><%=request.getAttribute("decouvert") %></strong></p>
                        </div>
                        <br/>
                    </div>
                </div>
                <div class="col-sm-8">
                    <div class="container"> 
                        <form method="GET" id="validateForm" action="operationServlet">
                            <div class="row">
                                <div class="col-sm-2">
                                        <div class="radio">
                                            <label><input type="radio" name="opert" value="Versement" onclick="document.getElementById('afficher').disabled = true;" id="validationCustom04" required>Versement</label>
                                        </div>
                                        <div class="radio">
                                            <label><input type="radio" name="opert" value="Retrait" onclick="document.getElementById('afficher').disabled = true;">Retrait</label>
                                        </div>
                                        <div class="radio">
                                            <label><input type="radio" name="opert" value="Virement" onclick="document.getElementById('afficher').disabled = false;">Virement</label>
                                        </div>  
                                </div>
                                <div class="col-sm-3">
                                    <input id="montantopt" type="text" name="montant" placeholder="Montant" class="form-control" id="validationCustom01" required>                                        
                                    <input type="text" name="numcpt" placeholder="Numéro de Compte" class="form-control" disabled="disabled" id="afficher" id="validationCustom02" required>
                                </div>
                                <div class="col-sm-3">
                                    <input type="hidden" name="numerocpt" value="<%=request.getAttribute("codecpt") %>" class="form-control">
                                </div>
                            </div> 
                            <div id="btnValider">
                                <button class="btn btn-primary" type="submit">Valider</button>
                            </div>
                        </form>
                         
                        <hr class="horiz"/>           
                        <h3 class="h4">    Listes des operations :</h3>
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                <th>Code Operation</th>
                                <th>Date Operation</th>
                                <th>Montant</th>
                                <th>Type</th>
                                </tr> 
                            </thead>
                            <tbody>
                                <%
                                    List<Operation> oppr = (List<Operation>)request.getAttribute("operations");
                                    for(Operation o : oppr){
                                %>
                                <tr>
                                    <td>op<%=o.getCode() %></td>
                                    <td><%=o.getDateOperation() %></td>
                                    <td><%=o.getMontant() %> dh</td>
                                    <td><%=o.getType() %></td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody> 
                        </table>
                         
                        <script>
                            (function() {
                            'use strict';

                            window.addEventListener('load', function() {
                              var form = document.getElementById('validateForm');
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
        </div> 
        
    </body>
</html>

