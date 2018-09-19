/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.servlet;

import aplicacion.builder.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
@WebServlet(name = "MiServlet", urlPatterns = {"/MiServlet"})
public class MiServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MiServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            FabricaPersonajes fabrica = new FabricaPersonajes();
            
            String btnHumano = request.getParameter("btnHumano");
            String btnElfo = request.getParameter("btnElfo");
            String btnEnano = request.getParameter("btnEnano");
            String btnOrco = request.getParameter("btnOrco");
            String btnTrol = request.getParameter("btnTrol");
            
            if(btnHumano!=null){
                
                fabrica.setPersonajeBuilder(new Humano());
                fabrica.construirPersonajeAbstracto();
                Personaje personajeCreado = fabrica.getPersonaje();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+personajeCreado.getEscudo().getTipo_escudo()+"' width=\"100\" height=\"100\"/></td>"); 
                out.println("<td><img src='"+personajeCreado.getCuerpo().getTipo_cuerpo()+"' width=\"150\" height=\"200\"/></td>");
                out.println("<td><img src='"+personajeCreado.getArma().getTipo_arma()+"' width=\"150\" height=\"200\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td><img src='"+personajeCreado.getMontura().getTipo_montura()+"' width=\"150\" height=\"200\"/></td>");
                out.println("<td></td>");
                out.println("</tr>");
                out.println("</table>");
                
                
            }
            
            if(btnElfo!=null){
                
                fabrica.setPersonajeBuilder(new Elfo());
                fabrica.construirPersonajeAbstracto();
                Personaje personajeCreado = fabrica.getPersonaje();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+personajeCreado.getEscudo().getTipo_escudo()+"' width=\"100\" height=\"100\"/></td>");
                out.println("<td><img src='"+personajeCreado.getCuerpo().getTipo_cuerpo()+"' width=\"150\" height=\"200\"/></td>");  
                out.println("<td><img src='"+personajeCreado.getArma().getTipo_arma()+"' width=\"150\" height=\"200\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td><img src='"+personajeCreado.getMontura().getTipo_montura()+"' width=\"150\" height=\"200\"/></td>");
                out.println("<td></td>");  
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            if(btnEnano!=null){
                
                fabrica.setPersonajeBuilder(new Enano());
                fabrica.construirPersonajeAbstracto();
                Personaje personajeCreado = fabrica.getPersonaje();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+personajeCreado.getEscudo().getTipo_escudo()+"' width=\"100\" height=\"100\"/></td>"); 
                out.println("<td><img src='"+personajeCreado.getCuerpo().getTipo_cuerpo()+"' width=\"150\" height=\"200\"/></td>");  
                out.println("<td><img src='"+personajeCreado.getArma().getTipo_arma()+"' width=\"150\" height=\"200\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td><img src='"+personajeCreado.getMontura().getTipo_montura()+"' width=\"150\" height=\"200\"/></td>");
                out.println("<td></td>"); 
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            if(btnOrco!=null){
                
                fabrica.setPersonajeBuilder(new Orco());
                fabrica.construirPersonajeAbstracto();
                Personaje personajeCreado = fabrica.getPersonaje();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+personajeCreado.getEscudo().getTipo_escudo()+"' width=\"100\" height=\"100\"/></td>");
                out.println("<td><img src='"+personajeCreado.getCuerpo().getTipo_cuerpo()+"' width=\"150\" height=\"200\"/></td>");  
                out.println("<td><img src='"+personajeCreado.getArma().getTipo_arma()+"' width=\"150\" height=\"200\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td><img src='"+personajeCreado.getMontura().getTipo_montura()+"' width=\"150\" height=\"200\"/></td>");
                out.println("<td></td>");
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            if(btnTrol!=null){
                
                fabrica.setPersonajeBuilder(new Trol());
                fabrica.construirPersonajeAbstracto();
                Personaje personajeCreado = fabrica.getPersonaje();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+personajeCreado.getEscudo().getTipo_escudo()+"' width=\"100\" height=\"100\"/></td>");
                out.println("<td><img src='"+personajeCreado.getCuerpo().getTipo_cuerpo()+"' width=\"150\" height=\"200\"/></td>");  
                out.println("<td><img src='"+personajeCreado.getArma().getTipo_arma()+"' width=\"150\" height=\"200\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td><img src='"+personajeCreado.getMontura().getTipo_montura()+"' width=\"150\" height=\"200\"/></td>");
                out.println("<td></td>");
                out.println("</tr>");
                out.println("</table>");
                
            }
            out.println("</body>");
            out.println("</html>");
        }
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
