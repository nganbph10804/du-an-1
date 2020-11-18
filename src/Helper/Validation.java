/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class Validation {
    
    public static void ValidateEmpty(JTextField field, StringBuilder sb,String errorMessage) {
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }

    public static void ValidateEmpty(JPasswordField field, StringBuilder sb,String errorMessage) {
        String password = new String (field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    public static void ValidateEmpty(JTextArea field, StringBuilder sb,String errorMessage) {
        
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    public static void ValidateDate(JTextField field, StringBuilder sb,String errorMessage) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(field.getText());
            field.setBackground(Color.white);
        } catch (Exception e) {
            sb.append(errorMessage).append("\n");
               field.setBackground(Color.yellow);
               field.requestFocus();
        }
       
    }
    
    public static boolean ValidateNumbers(JTextField field, StringBuilder sb,String errorMessage) {
        try {
           int numbers = Integer.parseInt(field.getText());
            field.setBackground(Color.white);
            
        } catch (Exception e) {
            sb.append(errorMessage).append("\n");
               field.setBackground(Color.yellow);
               field.requestFocus();
               
        }
       return false;
    }
    
     public static void ValidateEmail(JTextField field, StringBuilder sb,String errorMessage) {
        field.setBackground(Color.white);
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", field.getText()))) {       
            
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }
    }
}
