/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author omari
 */
public class Calculadora extends HttpServlet {

    int num1, num2;
    float res;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        num1 = Integer.parseInt(request.getParameter("num1"));
        num2 = Integer.parseInt(request.getParameter("num2"));
        String opcion = request.getParameter("Operacion");
        
        switch(opcion){
            case "Sumar":
                res = num1 + num2;
            break;
            case "Restar":
                res = num1 - num2;
            break;
            case "Multiplicar":
                res = num1 * num2;
            break;
            case "Dividir":
                res = num1 / num2;
            break;
        }
        System.out.println("Esto vale res " + res);
        PrintWriter out = new PrintWriter(response.getOutputStream());

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        out.println("<title>Resultados</title>");
        out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">");
        out.println("<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>");
        out.println("<link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>");
        out.println("<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/animate.min.css\" type=\"text/css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\">");
        out.println("</head>");
        out.println("<body id=\"page-top\">");
        out.println("<header>");
        out.println("<div class=\"header-content\">");
        out.println("<div class=\"header-content-inner\">");
        out.println("<h2>El resultado de la operacion es: " + res + "</h2>");
        out.println("</div>");
        out.println("</div>");
        out.println("</header>");
        out.println("<script src=\"js/jquery.js\"></script>");
        out.println("<script src=\"js/bootstrap.min.js\"></script>");
        out.println("<script src=\"js/jquery.easing.min.js\"></script>");
        out.println("<script src=\"js/jquery.fittext.js\"></script>");
        out.println("<script src=\"js/wow.min.js\"></script>");
        out.println("<script src=\"js/creative.js\"></script>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
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
