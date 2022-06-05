/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.ArrayList;

/**
 * this LoyaltyCustomer extends Customer for special customer in application
 */
public class LoyaltyCustomer extends Customer{
/**
 * overloading
 */
   /**
    * default constructor not has parameter with Casting 
    */
    public LoyaltyCustomer() {
        super();
    }
/**
 * doing Cast
 * constructor  has parameter  ID,  password,  UserName,  name,  age,  orders List to Initial
 * @param ID it is id of LoyaltyCustomer
 * @param password it is password of LoyaltyCustomer
 * @param UserName it is UserName of LoyaltyCustomer
 * @param name it is Name of LoyaltyCustomer
 * @param age it is Age of LoyaltyCustomer
 * @param orders it is List Orders of LoyaltyCustomer
 */
    public LoyaltyCustomer(String ID, String password, String UserName, String name, int age, ArrayList<Order> orders) {
        super(ID, password, UserName, name, age, orders);
    }
/**
 * Override method
 * TatalPrice in this method Calculate Total Price For list of  LoyaltyCustomer orders
 * but LoyaltyCustomer have offer in drinks and appetisers this items not  add to total price
 * @return total price for list orders of LoyaltyCustomer
 */
    @Override
    public float TatalPrice() 
    {
        float price=0.0f;
        for (int i = 0; i < super.getOrders().size(); i++) {
            for (int j = 0; j < super.getOrders().get(i).getMeals().size(); j++) {
                for (int k = 0; k <super.getOrders().get(i).getMeals().get(i).getItems().size() ; k++) {
                     if(super.getOrders().get(i).getMeals().get(i).getItems().get(k).getCategory().equals(Category.DRINKS)
                        ||(super.getOrders().get(i).getMeals().get(i).getItems().get(k).getCategory()
                                .equals(Category.APPETIZERS)))
                        {
                            price+=0;
                        }
                       else
                       {
                        price+=super.getOrders().get(i).getMeals().get(i).getItems().get(k).getPrice();
                       }
                    }
                }
                
            }
            
        
       return price;
    }
   /**
    *Override method
    * DisplayLoginData method implements from Display interface to display customer information
    */
    @Override
    public void DisplayLoginData() {
        
            System.out.println("Your ID LoyaltyCustomer : "+this.getID());
            System.out.println("Your Name LoyaltyCustomer : "+ this.getName());
            System.out.println("Your Age LoyaltyCustomer : "+this.getAge());
            System.out.println("Your UserName LoyaltyCustomer : "+this.getUserName());
            System.out.println("Your Password LoyaltyCustomer : "+this.getPassword());
            System.out.println("The Tatal Price Equal "+(this.TatalPrice())+" $");
    }
    
}
