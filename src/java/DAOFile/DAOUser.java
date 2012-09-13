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
    private static final String URL = "jdbc:mysql://jokerman.doesnetexist.com:3306/java";
    private static final String USER = "Jokerman";
    private static final String PWD = "DoubleScreen1";
    
    public DAOUser(){
        db = new DB_Generic();
    }
    
    public void createUser(String first, String last, Date joinDate, String password, String email, String address, String phoneNumber) throws Exception{
       
        String strDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd mm:hh:ss");
        strDate = sdf.format(joinDate);
        
        List<String> tableHeader = new ArrayList<String>();
        List<String> tableData = new ArrayList<String>();
        
        tableHeader.add("first_name");
        tableHeader.add("last_name");
        tableHeader.add("join_date");
        tableHeader.add("email");
        tableHeader.add("password");
        
        tableData.add(first);
        tableData.add(last);
        tableData.add(strDate);
        tableData.add(email);
        tableData.add(password);
        
        if(address != null){
            tableHeader.add("address");
            tableData.add(address);
        }
        
        if(phoneNumber != null){
            tableHeader.add("phone_number");
            tableData.add(phoneNumber);
        }
        
        db.openConnection(DRIVER, URL, USER, PWD);

        db.insertRecord("menu_user", tableHeader, tableData, true);
        

    } 
    
    public List<UserItem> getUser(){
        
        return null;
    }
    
    public boolean validateUser(String email, String password){
        return false;
    }
    
}
