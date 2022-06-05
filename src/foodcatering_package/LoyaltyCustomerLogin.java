/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * class LoyaltyCustomerLogin implements LoginData ,Display has attributes
 *   LoyaltyCustomer , index , List of LoyaltyCustomer
 */
public class LoyaltyCustomerLogin implements LoginData ,Display{
/**
 *  Access modifier private
 */
    private LoyaltyCustomer lc;
    private  int index ;
    private Scanner input = new Scanner(System.in);
/**
 * static ArrayList of orders
 */
    static ArrayList<LoyaltyCustomer>arrylist ;
   /**
    * default constructor not has parameter using to create ArrayList of orders
    */
    public LoyaltyCustomerLogin() {
          arrylist=new ArrayList<>();
           lc=new LoyaltyCustomer();


    }
/**
 * getter method to get index of Loyalty Customer Login in the list of LoyaltyCustomer
 * @return  index of Loyalty Customer Login in the list of LoyaltyCustomer
 */
    public int getIndex() {
        return index;
    }
/**
 * setter to set  index of Loyalty Customer Login in the list of LoyaltyCustomer
 * @param index  it is index of Loyalty Customer Login in the list of LoyaltyCustomer
 */
    public void setIndex(int index) {
        this.index = index;
    }
   
/**
 * Login Check the login of Loyalty Customer
 * @return true if successful Loyalty Customer login or false for Failure Loyalty Customer login 
 */
    @Override
    public boolean Login()
    {
         System.out.print("Enter Your UserName :");
        lc.setUserName(input.next());
        System.out.print("Enter Your Passordw :");
        lc.setPassword(input.next());
        //System.out.println("Hello Customer");
        boolean b=false;
        for(int i=0 ;i<arrylist.size();i++)
        {
            if (arrylist.get(i).getUserName().equals(lc.getUserName()))
            {
                if(arrylist.get(i).getPassword().equals(lc.getPassword()))
                { 
                    System.out.println("");
                    System.out.println(" ---------------------------------------");
                    System.out.println(" Sucess Login "+arrylist.get(i).getName()+"!!!☸☸☸");
                    lc =arrylist.get(i);
                    System.out.println(" ---------------------------------------");
                    index=i;
                    b=true;
                    break;
                }
                
            }
        }
        
    
      return b;
    
    
    
    }   
    /**
     * this method to Display Loyalty Customer information 
     */
    public  void DisplayLoyalityCustomer()
    {
            System.out.println("Your ID LoyaltyCustomer : "+this.lc.getID());
            System.out.println("Your Name LoyaltyCustomer : "+ this.lc.getName());
            System.out.println("Your Age LoyaltyCustomer : "+this.lc.getAge());
            System.out.println("Your UserName LoyaltyCustomer : "+this.lc.getUserName());
            System.out.println("Your Password LoyaltyCustomer : "+this.lc.getPassword());
    }
/**
 * Override method
 * this method to Display Login Data of list of Loyalty Customer in application
 */
    @Override
    public void DisplayLoginData() {
         for(int i=0 ;i<arrylist.size();i++)
          {
               //LoyaltyCustomer lc=a
            System.out.println("                            Customer"+(i+1)+"................");
            System.out.println("Name LoyaltyCustomer : "+arrylist.get(i).getName());
            System.out.println("Age LoyaltyCustomer : "+arrylist.get(i).getAge());
            System.out.println("UserName LoyaltyCustomer : "+arrylist.get(i).getUserName());
            System.out.println("ID LoyaltyCustomer : "+arrylist.get(i).getID());
            System.out.println("Password LoyaltyCustomer : "+arrylist.get(i).getPassword());
            System.out.println("");
            System.out.println("-------------------------------------------------------");
         }
    }
   /**
    * getter method to get special Loyalty Customer login
    * @return special Loyalty Customer login
    */
    public LoyaltyCustomer getLc() {
        return lc;
    }
    /**
     * setter method to set special Loyalty Customer login
     * @param lc it is special Loyalty Customer login
     */
    public LoyaltyCustomerLogin(LoyaltyCustomer lc) {
        this.lc = lc;
    }
}
