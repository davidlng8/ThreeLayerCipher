/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Vernam {
    private final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    private String input;
    private ArrayList<Integer> key;

    /*
     * Constructor for the vernam encryption module
     */
    public Vernam(String input, ArrayList<Integer> key) {
        this.input = input;
        this.key = key;
    }
    /*
     * Algorithm to perform modulo subtraction to get original text
     */
    public String decrypt(){
	String decrypted = "";
	int indx, n = 0, value;
        boolean larger = false;
	for(int i = 0; i < input.length(); i++){
        	
            indx = alpha.indexOf(input.charAt(i));
            //System.out.println("Char: "+cipherText.charAt(i)+" Index: "+indx);
            if(indx >= 0)
            {
                value = (Math.abs(indx - key.get(n)))%26;
                larger = ((indx - key.get(n)) > 0);
                
               /* System.out.println("ABS value of: "+indx+" - "+key.get(n)+" = "+
                        Math.abs(indx - key.get(n))+" value:"+value);*/
                if(value > 0 && !larger)
                    value = 26 - value;
                
                decrypted += alpha.charAt(value);
                n++;
            }
            else
                decrypted += input.charAt(i); 
			
	}
	return decrypted;
    }
    
    /*
     * ALgorithm to perform modulo addition to get cipher text values
     */
    public String encrypt(){
        int indx = 0, n = 0, converter;
	String encrypted = "";
	for(int i = 0; i < input.length(); i++)
	{
		indx = alpha.indexOf(input.toUpperCase().charAt(i));
		if(indx >= 0)
		{
			converter = (indx + key.get(n))%26;
			encrypted += alpha.charAt(converter);
			n++;
		}
                else
			encrypted += input.charAt(i); 
                        //print the spaces
		
	}
	return encrypted;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public ArrayList<Integer> getKey() {
        return key;
    }

    public void setKey(ArrayList<Integer> key) {
        this.key = key;
    }
    
    
    
}
