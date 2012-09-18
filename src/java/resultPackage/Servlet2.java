/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resultPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JokermanBuilt
 */
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

    private servlet2Controller sC;
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String cpu = request.getParameter("cpu");
        String ram = request.getParameter("ram");
        String hdd = request.getParameter("hdd");
        request.setAttribute("cpu", cpu);
        request.setAttribute("ram", ram);
        request.setAttribute("hdd", hdd);
        
        String order = cpu + "`" + ram + "`" + hdd;
         System.out.println("--------------------------------------------------------------------\nOrder string created");
        sC.placeOrder(order);
        System.out.println("--------------------------------------------------------------------\nALL DONE");
        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result.jsp");
        //dispatcher.forward(request, response);
        
    }
    
    public void init(){
        sC = new servlet2Controller();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
