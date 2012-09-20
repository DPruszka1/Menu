/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import db.accessor.DBAccessor;
import db.accessor.DB_Generic;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JokermanBuilt
 */
public class servletDAO {
    private DBAccessor db;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://jokerman.doesntexist.com:3306/java";
    private static final String USER = "Jokerman";
    private static final String PWD = "DoubleScreen1";
    
    public servletDAO(){
        db = new DB_Generic();
    }
    
    public void placeOrder(orderObject order){
        System.out.println("--------------------------------------------------------------------\nPRE DAO");
        try {
            db.openConnection(DRIVER, URL, USER, PWD);
            
            System.out.println("--------------------------------------------------------------------\nstart DAO");
            try {
                List<String> header = new ArrayList<String>();
                List<String> info = new ArrayList<String>();
                header.add("`name`");
                info.add(order.getName().toString());
                
                String strOrder = order.getCpu() + "!" + order.getRam() + "!" + order.getHdd();
                header.add("`order`");
                info.add(strOrder.toString());
                System.out.println("-------------------------------------------------\n B4 QUarry");
                db.insertRecord("r_order" , header, info, true);
            } catch (SQLException ex) {
                Logger.getLogger(servletDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(servletDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("--------------------------------------------------------------------\nEnd DAO");
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(servletDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servletDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(servletDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
