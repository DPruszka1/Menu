/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resultPackage;

/**
 *
 * @author JokermanBuilt
 */
public class servlet2Controller {
    
    private servletDAO sDAO;
    
    public void placeOrder(String order){
        System.out.println("--------------------------------------------------------------------\nPlacing order (controller)");
        sDAO.placeOrder(order);
    }

    public servlet2Controller(){
        sDAO = new servletDAO();
    }
}
