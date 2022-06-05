/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  extends Person implements Display interface has some
 * attributes ID,password,menu methods 
 * can update menu (add meal to menu or 
 * remove meal from menu or update meal [by remove item of meal or remove item from meal]
 * can add loyalty customer for loyalty customer list or remove loyalty customer.. 
 */
public class Admin extends Person implements Display{
       
    private Scanner input = new Scanner(System.in);
    private String ID;
    private String password;
    private Menu menu;
    /**
     * overloading constructors 
     * 
    /**
     * default constructor not has parameter
     */
    public Admin() {
    }
/**
 * 
 * @param name is name of admin
 * @param age  is age of admin
 * @param ID is id of admin 
 * @param  password is password of admin
 */
    public Admin(String ID, String password, String name, int age) {
        super(name, age);
        this.ID = ID;
        this.password = password;

    }
/**
 *  getter method to get Menu
 * @return Menu of application 
 */
    public Menu getMenu() {
        return menu;
    }
/**
 * setter method to set menu
 * @param menu it is menu of application 
 */

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
/**
 * getter method to get id admin
 * @return id admin
 */
    public String getID() {
        return ID;
    }
/**
 * setter method to set id
 * @param ID it is id admin
 */
    public void setID(String ID) {
        this.ID = ID;
    }
/**
 * getter method to get password
 * @return password of admin
 */
    public String getPassword() {
        return password;
    }
/**
 * setter method to set password
 * @param password it is password of admin
 */
    public void setPassword(String password) {
        this.password = password;
    }
/**
 * 
 * Override Method
 * for display admin information 
 */  
    @Override
    public void DisplayLoginData() {
                
}
}
