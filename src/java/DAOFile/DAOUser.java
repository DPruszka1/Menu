/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOFile;

import db.accessor.DBAccessor;
import db.accessor.DB_Generic;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JokermanBuilt
 */
public class DAOUser {
 
    private DBAccessor db;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://jokerman.doesnetexist.com:3306";
    private static final String USER = "Jokerman";
    private static final String PWD = "DoubleScreen1";
    
    public DAOUser(){
        db = new DB_Generic();
    }
    
    public void createNewUser(UserItem user) throws Exception{
       
        String strDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd mm:hh:ss");
        strDate = sdf.format(user.getJoinDate());
        
        List<String> tableHeader = new ArrayList<String>();
        List<String> tableData = new ArrayList<String>();
        
        tableHeader.add("first_name");
        tableHeader.add("last_name");
        tableHeader.add("join_date");
        tableHeader.add("email");
        tableHeader.add("password");
        
        tableData.add(user.getFirstName());
        tableData.add(user.getLastName());
        tableData.add(strDate);
        tableData.add(user.getEmail());
        tableData.add(user.getPassword());
        
        if(user.getAddress() != null){
            tableHeader.add("address");
            tableData.add(user.getAddress());
        }
        
        if(user.getPhoneNumber() != null){
            tableHeader.add("phone_number");
            tableData.add(user.getPhoneNumber());
        }
        
        db.openConnection(DRIVER, URL, USER, PWD);

        db.insertRecord("java.menu_user", tableHeader, tableData, true);
        

    } 
    
    public List<UserItem> getUser(){
        
        return null;
    }
    
    public boolean validateUser(String email, String password){
        return false;
    }
    
}
