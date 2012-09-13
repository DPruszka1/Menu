/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOFile;

import java.util.Date;

/**
 *
 * @author JokermanBuilt
 */
public class UserItem {
    private String firstName;
    private String lastName;
    private String email;
    private int userId;
    private String phoneNumber;
    private String address;
    private String password;
    private Date joinDate;
    
    public UserItem(String first, String last, Date joinDate, String password, String email, String address, String phoneNumber){
        this.firstName = first;
        this.lastName = last;
        this.joinDate = joinDate;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Date getJoinDate(){
        return joinDate;
    }
    
    public void setJoinDate(Date date){
        this.joinDate = date;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
