/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Vegeniere {
    private final static String main = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    private String input;
    private String key;
    
    /*Changes alphabet to reflect a row in the table*/
    public void changeAlpha(char col){
        String newAlph = "", add = "";
        for(int q = 10; q < Character.getNumericValue(col); q++)        
            add += Character.toUpperCase(Character.forDigit(q, 36));
        
        for(int x = Character.getNumericValue(col); x < 36; x++)
            newAlph += Character.toUpperCase(Character.forDigit(x, 36));
        
        alpha = newAlph + add;
    }
    
    public Vegeniere(String input, String code) {
        this.input = input;
        this.key = code.toUpperCase();
    }
    
    /*
     * encryption algorithm
     */
    public String encrypt() {
        String output = "";
        //change plaintext to upper case
        input = input.toUpperCase();
        for (int i = 0, j = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!alpha.contains(Character.toString(c))){
                output += c;
                continue;
            }
            changeAlpha(c);
            output += alpha.charAt(main.indexOf(key.charAt(j)));
            //ensures j does not exceed key length
            j = ++j % key.length();
        }
        return output;
    }

    public String decrypt() {
        String output = "";
        input = input.toUpperCase();
        for (int i = 0, j = 0; i < input.length(); i++) {
           char c = key.charAt(j);
            changeAlpha(c);
            if(!alpha.contains(Character.toString(input.charAt(i)))){
                output += input.charAt(i);
                continue;
            }
            output += main.charAt(alpha.indexOf(input.charAt(i)));
            j = ++j % key.length();
        }
        return output;
    }
    

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getCode() {
        return key;
    }

    public void setCode(String code) {
        this.key = code;
    }
    
    
}
