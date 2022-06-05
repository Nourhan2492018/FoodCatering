/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

/**
 * class Item has attributes     String name static Category category;
   private int NumOfCalories;
   private float Price;
   private int Portion;
 */
public class Item {
    /**
     * using static method and static member .........
     *    private String name ,private static Category category private int NumOfCalories;private float Price;
           private int Portion;
     */
   private String name;
   private static Category category;
   private int NumOfCalories;
   private float Price;
   private int Portion;
   /**
    * overloading 
    */
   /**
    * default constructor has parameter Category 
    * @param category it is type of item
    */
   public Item(Category category) {
    this.category = category;
    }
   /**
    * 
    * @param name it is name of item 
    * @param category it is type of item
    * @param NumOfCalories it is number of calories of item
    * @param Price it is price of item
    * @param Portion it is portion of item
    */
    public Item(String name, Category category, int NumOfCalories, float Price, int Portion) {
        this.name = name;
        this.category = category;
        this.NumOfCalories = NumOfCalories;
        this.Price = Price;
        this.Portion = Portion;
    }
/**
 * getter method to get name of item
 * @return name of item
 */
    
    public String getName() {
        return name;
    }
/**
 * setter method to set name of item
 * @param name it is name of item
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * getter method to get number of Calories
 * @return number of Calories
 */
    public int getNumOfCalories() {
        return NumOfCalories;
    }
/**
 * setter method to set number of Calories
 * @param NumOfCalories it is number of Calories
 */
    public void setNumOfCalories(int NumOfCalories) {
        this.NumOfCalories = NumOfCalories;
    }
/**
 * getter method to get price of item 
 * @return price of item 
 */
    public float getPrice() {
        return Price;
    }
/**
 * setter method to set price of item 
 * @param Price it is price of item 
 */
    public void setPrice(float Price) {
        this.Price = Price;
    }
/**
 * getter method to get Portion of item
 * @return Portion of item
 */
    public int getPortion() {
        return Portion;
    }
/**
 * setter method to set Portion of item
 * @param Portion it is Portion of item
 */
    public void setPortion(int Portion) {
        this.Portion = Portion;
    }
/**
 * static method to get Category of item
 * @return Category of item
 */
    public static Category getCategory() {
        return category;
    }
/**
 * setter method to set Category of item
 * @param category it is Category of item
 */
    public void setCategory(Category category) {
        this.category = category;
    }
   
}
