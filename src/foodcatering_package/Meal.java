/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.ArrayList;

/**
class Meal attributes
* IDMeal it is id of meal,  
* TypeMeal it is type of meal (family or individual)
* items it is list items of meal
 */
public  class Meal {
    /**
     * 
     */
    private String IDMeal;
    private String TypeMeal;
    private ArrayList<Item >items;
 /**
 * default Constructor not has parameter
 */
    public Meal() {
        this.items= new ArrayList<Item>();
    }
/** Constructor has parameter String IDMeal, String TypeMeal, ArrayList items
 * 
 * @param IDMeal it is id of meal.
 * @param TypeMeal it is type of meal (family or individual)
 * @param items  it is list items of meal
 */
    public Meal(String IDMeal, String TypeMeal, ArrayList<Item> items) {
        this.IDMeal = IDMeal;
        this.TypeMeal = TypeMeal;
        this.items = items;
      
    }


 /**
  * getter method to get list items of meal
  * @return list items of meal
  */   
    public ArrayList <Item> getItems() {
        return items;
    }
/**
 * setter method to set list items of meal
 * @param items it is list items of meal
 */
    public void setItems(ArrayList <Item> items) {
        this.items = items;
    }
/**
 * getter method to get type of meal (family or individual)
 * @return type of meal (family or individual)
 */
    public String getTypeMeal() {
        return TypeMeal;
    }
/**
 * setter set type of meal (family or individual)
 * @param TypeMeal it is type of meal (family or individual)
 */
    public void setTypeMeal(String TypeMeal) {
        this.TypeMeal = TypeMeal;
    }
/**
 * getter to get id of meal
 * @return id of meal
 */

    public String getIDMeal() {
        return IDMeal;
    }
/**
 * setter method to set id of meal
 * @param IDMeal it is id of meal
 */
    public void setIDMeal(String IDMeal) {
        this.IDMeal = IDMeal;
    }
    
}
