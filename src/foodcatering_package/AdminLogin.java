/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.Scanner;

/**
 * class AdminLogin implements LoginData ,Display interface and has one parameter 
 * type of class Admin 
 * Admin Id ="123" And password ="249"
 */
public class AdminLogin implements LoginData ,Display{
    private  Admin admin;
    private Scanner input = new Scanner(System.in);
    /**
     * default constructor for create admin
     * Admin Id ="123" And password ="249"
     */
    public AdminLogin() {
       admin = new Admin("123", "249", "nour", 19);
    }
/**
 * Override Method
 * Login method its boolean method for admin inter this application
 * @return true if successful login or false for Failure login 
 */  
    @Override
    public boolean Login( ) 
    {
        Admin adminLogin =new Admin();
        System.out.println("");
        
        System.out.println("");
        System.out.println("                                                                  Hello Admin...............");
        System.out.println("                                                        ========================================");
        System.out.println("");
        System.out.print("Enter ID Admin : ");
        adminLogin.setID(input.next());
        if(admin.getID().equals(adminLogin.getID()))
        {
            System.out.print("Enter Passord Admin : ");
            
            adminLogin.setPassword(input.next());
            if(admin.getPassword().equals(adminLogin.getPassword()))
            {
                return true;
            }
            System.out.println("Error Password");
            return false;
        }
        System.out.println("Error ID");
        return false;
    }
    /**
     * Override method
     * DisplayLoginData method to display admin information
     */
      @Override
    public void DisplayLoginData() {
            System.out.println("ID Admin : "+this.admin.getID());
            System.out.println("Name Admin : "+this.admin.getName());
            System.out.println("Age Admin: "+this.admin.getAge());
            System.out.println("Passord Admin : "+this.admin.getPassword()); 
    }
    /**
     * getter method to get admin of application
     * @return admin of application
     */
    public Admin getAdmin() {
        return admin;
    }
/**
 * setter method to set 
 * @param admin its admin manage this application 
 */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    } 
}
