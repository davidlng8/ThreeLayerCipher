/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Admin
 */
public class Ceaser {
    private final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    private String input;
    private int shift;

    public Ceaser(String input, int shift) {
        this.input = input;
        this.shift = shift;
    }
    
    public String encrypt(){
        String output = "";
        int indx = 0;
	for(int i = 0; i < input.length(); i++){
            indx = alpha.indexOf(input.toUpperCase().charAt(i));
            if(indx == -1){
                output += input.toUpperCase().charAt(i);
                continue;
            }
            
            indx = (indx+shift)%26;
            output += alpha.charAt(indx);
	}
        return output;
    }
    
    public String decrypt(){
        String output = "";        
        int indx = 0;
        
	for(int i = 0; i < input.length(); i++){
            indx = alpha.indexOf(input.toUpperCase().charAt(i));
            if(indx == -1){
                output += input.toUpperCase().charAt(i);
                continue;
            }
            
            if(indx < shift){
                indx = 26 - shift + indx; 
            }
            else{
                indx -= shift;
            }
            output += alpha.charAt(indx);
	}
        return output;
    }
    
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    
 }
