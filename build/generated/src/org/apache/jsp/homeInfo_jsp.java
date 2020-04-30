package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.banque.model.Operation;
import java.util.List;

public final class homeInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel='stylesheet' href='css/bootstrap.min.css'>\n");
      out.write("        <link rel='stylesheet' href='css/design.css'>\n");
      out.write("        <link rel='stylesheet' href='css/sweetalert.css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron text-center\">\n");
      out.write("            <h2>Compte Bancaire</h2>\n");
      out.write("            <div class=\"col-sm-3\">  </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-search\"></i></span>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"chercher\" placeholder=\"Chercher un compte\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                <a href=\"homeServlet\"><btn class=\"btn btn-secondary\" name=\"\">Chercher</btn></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"card\" style=\"width:200px\">\n");
      out.write("                        <img src=\"cl1.jpg\" class=\"rounded\" alt=\"Image Client\" width=\"200\" height=\"150\" />\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <br/>  \n");
      out.write("                            <p class=\"card-text\">=> Nom : <strong>..</strong></p>\n");
      out.write("                            <p class=\"card-text\">=> Prenom : <strong>..</strong></p>\n");
      out.write("                            <p class=\"card-text\">=> Email : <strong>..</strong></p>\n");
      out.write("                            <p class=\"card-text\">=> Phone : <strong>..</strong></p>\n");
      out.write("                            <p class=\"card-text\">=> Date Naissance : <strong>..</strong></p>\n");
      out.write("                            <p class=\"card-text\"><strong> - - - - - - - Compte - - - - - - - -</strong></p>\n");
      out.write("                            <p class=\"card-text\">=> Date Création : <strong>..</strong></p>\n");
      out.write("                            <p class=\"card-text\">=> Solde : <strong>..</strong></p>\n");
      out.write("                            <br/> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        \n");
      out.write("                                <div class=\"radio\">\n");
      out.write("                                    <label><input type=\"radio\" name=\"optradio\">Versement</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"radio\">\n");
      out.write("                                    <label><input type=\"radio\" name=\"optradio\">Retrait</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"radio\">\n");
      out.write("                                    <label><input type=\"radio\" name=\"optradio\">Virement</label>\n");
      out.write("                                    <label><input type=\"text\" name=\"montant\" placeholder=\"Numéro de compte...\" class=\"form-control\"></label>\n");
      out.write("                                </div>\n");
      out.write("                                <div >\n");
      out.write("                                    <a href=\"\"><button class=\"btn btn-primary\">Valider</button></a>\n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                        <br/> <br/> \n");
      out.write("                        <h3 class=\"h4\">    Listes des operations :</h3>\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Code Operation</th>\n");
      out.write("                                <th>Date Operation</th>\n");
      out.write("                                <th>Montant</th>\n");
      out.write("                                <th>Type</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                List<Operation> oppr = (List<Operation>)request.getAttribute("operations");
                                for(Operation o : oppr){
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>op");
      out.print(o.getCode() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(o.getDateOperation() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(o.getMontant() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(o.getType() );
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
