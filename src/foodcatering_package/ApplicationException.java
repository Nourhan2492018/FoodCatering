/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

/**
 * ApplicationException extends Exception for handling Exceptions 
 */
public class ApplicationException extends Exception{
/**
 * default constructor 
 */
    public ApplicationException() {
    }
/**
 * constructor has parameter take Error massage 
 * @param string it is Error massage 
 */
    public ApplicationException(String string) {
        super(string);
    }

}
