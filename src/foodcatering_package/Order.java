/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * class Order implements Display interface has attributes   UniqueCode;
     ArrayList  meals; RegisterOrderData; DelivaryOrderData; ReceiveOrderAdress;
 */
public class Order implements Display{
 /**
  *  Access modifier final of UniqueCode
  */
    final private String UniqueCode;
    private ArrayList<Meal >meals;
    private Date RegisterOrderData;
    private Date DelivaryOrderData;
    private String ReceiveOrderAdress;
    private Scanner input = new Scanner(System.in);
/**
 * overloading constructors
 */
/**
 *  default constructor has parameter UniqueCode of a order
 * @param UniqueCode  it is UniqueCode of a order
 */
    public Order(String UniqueCode) {
        this.UniqueCode = UniqueCode;
        meals= new ArrayList<>();
    }
/**
 * constructor has parameters String UniqueCode, Date RegisterOrderData, Date ReceiveOrderData
 * @param UniqueCode  it is UniqueCode of a order
 * @param RegisterOrderData it is Register Order Data
 * @param ReceiveOrderData  it is Receive Order Data
 */
    public Order(String UniqueCode, Date RegisterOrderData, Date ReceiveOrderData) {
        this.UniqueCode = UniqueCode;
        this.RegisterOrderData = RegisterOrderData;
        this.DelivaryOrderData = ReceiveOrderData;
    }
/**
 * getter method to get UniqueCode of a order
 * @return UniqueCode of a order
 */
    public String getUniqueCode() {
        return UniqueCode;
    }
/**
 * 
 * @param UniqueCode it is UniqueCode of a order
 * @param meals it is list of meals of order
 * @param RegisterOrderData it is Register Order Data 
 * @param ReceiveOrderData it is Receive Order Data
 * @param ReceiveOrderAdress it is Receive address order
 */
    public Order(String UniqueCode, ArrayList<Meal> meals, Date RegisterOrderData, Date ReceiveOrderData, String ReceiveOrderAdress) {
        this.UniqueCode = UniqueCode;
        this.meals = meals;
        this.RegisterOrderData = RegisterOrderData;
        this.DelivaryOrderData = ReceiveOrderData;
        this.ReceiveOrderAdress = ReceiveOrderAdress;
    }
/**
 * getter method to get Register Order Data 
 * @return  Register Order Data 
 */
    public Date getRegisterOrderData() {
        return RegisterOrderData;
    }
/**
 * setter method to set  Register Order Data 
 * @param RegisterOrderData Register Order Data 
 */
    public void setRegisterOrderData(Date RegisterOrderData) {
        this.RegisterOrderData = RegisterOrderData;
    }
/**
 * getter method to get Receive Order Data
 * @return Receive Order Data
 */   
    public Date getDelivaryOrderData() {
        return DelivaryOrderData;
    }
/**
 * setter method to set Receive Order Data
 * @param ReceiveOrderData it is Receive Order Data 
 */
    public void setDelivaryOrderData(Date ReceiveOrderData) {
        this.DelivaryOrderData = ReceiveOrderData;
    }
/**
 * getter method to get Receive address order
 * @return Receive address order
 */
    public String getReceiveOrderAdress() {
        return ReceiveOrderAdress;
    }
/**
 * setter method to set Receive address order
 * @param ReceiveOrderAdress it is Receive address order
 */
    public void setReceiveOrderAdress(String ReceiveOrderAdress) {
        this.ReceiveOrderAdress = ReceiveOrderAdress;
    }
/**
 * getter method to get list of meals of order
 * @return list of meals of order
 */
    public ArrayList<Meal> getMeals() {
        return meals;
    }
/**
 * setter method to set list of meals of order
 * @param meals it is list of meals of order
 */
    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
    
 // Updata Order For Customers Consists of List Of Meals 
    // Add Meal To List
/**
 * this method is used  to add new meal in menu
 * @param meal it is meal yon to add in menu
 */ 
    public void AddMeal(Meal meal )
    {
        meals.add(meal);  
    }
    // Remove Meal To List
/**
 * this method is used  to remove meal from list of meals by its id
 * @param id it is id of meal that will remove from list meals of order
 */
    public void RemoveMeal(String id)
    {
       boolean b=false;
       for(int i=0;i<meals.size();i++)
       {
          if(meals.get(i).getIDMeal().equals(id))
          {
            meals.remove(meals.get(i));
            b=true;
            break;
          }          
       }       
       if(b==false)
       {
           System.out.println("Error : NOT Found Item");
       }
    }
    // Updata Meal Of List By Add Item Or Remove Item
/**
 * this method is used  to update meal from list of meals by its id can (Add item or remove item)
 * @param id it is id of meal that will update from list meals of order
 */
    public void UpdataMeal(String id)
    {
       boolean b=true;
       Meal meal= new Meal();
       for(int i=0;i<meals.size();i++)
       {
          if(meals.get(i).getIDMeal().equals(id))
          {
              System.out.println("(1)Add Item .......(2)Remove Item.........");
              System.out.println("_______________________________________________________");
              int a=input.nextInt();
              switch(a)
              {
                  case 1:
                      meal=meals.get(i);
                      meals.remove(i);
                      System.out.println("Enter Name of Item ");
                      String name=input.next();
                      System.out.println("Enter NumOfCalories of Item ");
                      int n=input.nextInt();
                      System.out.println("Enter Price of Item  ");
                      float p=input.nextFloat();
                      System.out.println("Enter Portion of Item  ");
                      int x=input.nextInt();
                      Item e=new Item(name, Category.DESERTS, n, p, x);
                      meal.getItems().add(e);
                      meals.add(i,meal);
                      break;
                  case 2:
                      System.out.println("Enter Name of Item Updat:");
                      String s1=input.next();
                      boolean b2=false;
                      for (int j = 0; j < meals.get(i).getItems().size(); j++) {
                            if (meals.get(i).getItems().get(j).getName().equals(s1)) 
                            {
                                meals.get(i).getItems().remove(j);
                                b2=true;
                                break;
                            }
                      }
                     if(b2==false)
                        {
                         System.out.println("Error : NOT Found Item");
                        }
                      break;
                  default:
                        System.out.println("Error Input ...........");
                      break;          
               }
            }
       }
    }
/**
 * Display Login Data of list meals
 */
    @Override
    public void DisplayLoginData() {
        for(int i=0;i<meals.size();i++)
        {
            System.out.println("               "+(i+1)+" - Meal" );
            System.out.println("              ********************");
            ArrayList<Item> items =meals.get(i).getItems();
            for(int j=0;j<items.size();j++)
            {
            System.out.println((j+1)+" - Item" );
            System.out.println("---------");
            System.out.println("Name Item :"+items.get(j).getName() );
            System.out.println("NumOfCalories Item :"+items.get(j).getNumOfCalories());
            System.out.println("Portion Item :"+items.get(j).getPortion());
            System.out.println("Price Item :"+items.get(j).getPrice());
            System.out.println("-------------------------------------------------------");
            }
            System.out.println("================================================================");
        }
    }
}
