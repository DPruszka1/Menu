/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author JokermanBuilt
 */
public class servlet2Controller {  // this is a service (got naming messed up)
    
    private servletDAO sDAO;
    
    public void placeOrder(orderObject order){
        System.out.println("--------------------------------------------------------------------\nPlacing order (controller)");
        sDAO.placeOrder(order);
    }

    public servlet2Controller(){
        sDAO = new servletDAO();
    }
}
