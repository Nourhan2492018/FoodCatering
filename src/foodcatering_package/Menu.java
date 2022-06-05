/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * class Menu implements Display interface has attributes list of meals 
 */
public class Menu implements Display{
private Scanner input = new Scanner(System.in);
/**
 * private data
 */
    private ArrayList <Meal> ArrayOfMeals;
    
/**
 * 
 * @return 
 */
    public ArrayList<Meal> getArrayOfMeals() {
        return ArrayOfMeals;
    }
/**
 * 
 * @param ArrayOfMeals 
 */
    public void setArrayOfMeals(ArrayList<Meal> ArrayOfMeals) {
        this.ArrayOfMeals = ArrayOfMeals;
    }
/**
 * default constructor
 */
    public Menu() {
        ArrayOfMeals=new ArrayList <Meal>();
    }
/**
 * setter method to set list of meals
 * @param ArrayOfMeals it is set list of meals
 */
    public Menu(ArrayList<Meal> ArrayOfMeals) {
        this.ArrayOfMeals = ArrayOfMeals;
    }
/**
 * this method is used  to add new meal in menu
 * @param meal it is meal yon to add in menu
 */    
     public void AddMeal(Meal meal )
    {
        ArrayOfMeals.add(meal);
       
    }
 /**
  * this method is used  to remove meal from list of meals
  * @param meal it is meal will remove from list of meals
  */   
   public void RemoveMeal(Meal meal)
   {
       boolean b=false;
       for(int i=0;i<ArrayOfMeals.size();i++)
       {
          if(ArrayOfMeals.get(i).getIDMeal().equals(meal.getIDMeal()))
          {
            ArrayOfMeals.remove(i);
            b=true;
            break;
          }  
       }
       if(b==false)
       {
           System.out.println("Error : NOT Found meal ");
       }
    }
  /**
   * this method is used  to Update meal from list of meals by (Add item or remove item) from meal
   * @param meal its is meal will Update meal from list of meals by (Add item or remove item) from meal
   */  
    public void UpdataMeal(Meal meal)
    {
       boolean b=false;
       for(int i=0;i<ArrayOfMeals.size();i++)
       {
          if(ArrayOfMeals.get(i).getIDMeal().equals(meal.getIDMeal()))
          {
              System.out.println("(1)Add Item .......(2)Remove Item.........");
              System.out.println("_______________________________________________________");
              int a=input.nextInt();
              switch(a)
              {
                  case 1:
                      meal=ArrayOfMeals.get(i);
                       ArrayOfMeals.remove(i);
                      System.out.println("Enter Name of Item ");
                      String id=input.next();
                      System.out.println("Enter NumOfCalories of Item ");
                      int n=input.nextInt();
                      System.out.println("Enter Price of Item  ");
                      float p=input.nextFloat();
                      System.out.println("Enter Portion of Item  ");
                      int x=input.nextInt();
                      Item e=new Item(id, Category.DESERTS, n, p, x);
                      meal.getItems().add(e);
                      ArrayOfMeals.add(i,meal);
                      break;
                  case 2:
                      System.out.println("Enter Name of Item Updat:");
                      String s1=input.next();
                      boolean b2=false;
                      for (int j = 0; j < ArrayOfMeals.get(i).getItems().size(); j++) {
                            if (ArrayOfMeals.get(i).getItems().get(j).getName().equals(s1)) 
                            {
                                ArrayOfMeals.get(i).getItems().remove(j);
                                b2=true;
                                break;
                            }                           
                        }
                     if(b2==false)
                        {
                         System.out.println("Error : NOT Found Item");
                        }
                      break;               
                }
              b= true;
              //break;
             }
           
        }
       if (b==false) {
           System.out.println("Error : NOT Found id"); 
           }
    }
    /**
     * Override method
     * this method is used to Display Data of meals
     */
    @Override
    public void DisplayLoginData() {
        for(int i=0;i<ArrayOfMeals.size();i++)
        {
            System.out.println("               "+(i+1)+" - Meal" );
            System.out.println("              ********************");
            ArrayList<Item> items = ArrayOfMeals.get(i).getItems();
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
