/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

/**
 * class Guest  extends Customer for any client 
 */
public class Guest  extends Customer{

 /**
 * Override method
 * TatalPrice in this method Calculate Total Price For list of  LoyaltyCustomer orders
 * @return Total price of Guest
 */
    @Override
    public float TatalPrice() {
        float price=0.0f;
        for (int i = 0; i < super.getOrders().size(); i++) {
            for (int j = 0; j < super.getOrders().get(i).getMeals().size(); j++) {
                for (int k = 0; k <super.getOrders().get(i).getMeals().get(i).getItems().size() ; k++) {
                     
                        price+=super.getOrders().get(i).getMeals().get(i).getItems().get(k).getPrice();
                       
                    }
                }
                
            }
            
        
       return price;
    }
    /**
    * DisplayLoginData method implements from Display interface to display customer information
    */
    @Override
    public void DisplayLoginData() {
           System.out.println("Your Name Guest : "+ this.getName());
           System.out.println("Your Age Guest : "+this.getAge());
           System.out.println("The Tatal Price Equal "+(this.TatalPrice())+" $");
    }
        

    
}
