package resultPackage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JokermanBuilt
 */

public class ResultViewer extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException{
        response.setContentType("text/html;charset=UTF-8");
        String destination = "result.jsp";
        
    }
    
}
