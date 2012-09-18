/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOFile.UserItem;
import Service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JokermanBuilt
 */
public class UserController extends HttpServlet {

    private UserService  userServ;
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
        response.setContentType("text/html;charset=UTF-8");
       
        UserItem user; 
        
        String first = request.getParameter("firstname");
        String last = request.getParameter("lastname");
        String email = request.getParameter("email");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String pNumber = request.getParameter("pnumber");
        String pwd = request.getParameter("pwd");
        String address;
        
        if(!street.equals("") && !city.equals("") && !state.equals("") && !zip.equals("")){
           address  = street + "`" + city + "`" + state + "`" + zip;
        }else{
           address = null;
        }
         
        if(pNumber.equals("")){
          pNumber = null;  
        }
        
        user = new UserItem(first, last, new Date(), pwd, email, address, pNumber);
        try {
            userServ.createNewUser(user);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("info", "hello world");
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/usercreation.jsp");
        dispatcher.forward(request, response);
        
     }
    
    @Override
    public void init(){
        userServ = new UserService();
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
