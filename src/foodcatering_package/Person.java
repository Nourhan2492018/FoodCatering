/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

/**
 * This Class Person has attributes Name and Age For Class Customer will 
 * extends From It.
 * 
 */
public class Person  {
    private String name;
    private int age;
/**
 *  constructor Not has parameters
 */
    public Person() {
    }
/**
 * constructor has parameters To Initial Name And Age
 * @param name it is Name of Person
 * @param age it is Age of person 
 */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
/**
 * getter Method   To get   Name of Person 
 * @return  Name of Person
 */
    public String getName() {
        return name;
    }
    /**
    * setter Method  has parameter To set  Name of Person
    * @param name it is Name of Person
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * Getter Method has parameters To get Age of Person
    * @return   Age of Person
    */
    public int getAge() {
        return age;
    }
   /**
    * Setter Method has parameters To set   Age of Person
    * @param  age it is  Age of Person
    */
    public void setAge(int age) {
        this.age = age;
    }
    
}
