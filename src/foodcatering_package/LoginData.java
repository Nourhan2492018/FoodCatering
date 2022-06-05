/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

/**
 * interface LoginData for login admin or loyaltyCustomer 
 */
public interface LoginData {
    /**
     * abstract boolean Login to check login true or false
     * @return true if successful login or false for Failure login  
     */
   public abstract boolean Login();
}
