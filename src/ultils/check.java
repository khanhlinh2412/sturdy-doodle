/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultils;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sethk
 */
public class check {

    public static boolean checkEmpty(JTextField txt, String mss) {
       if(txt.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, mss);
           txt.requestFocus();
           return true;
       }
       return false;
    }
 public static boolean checkEmail(JTextField txt, String mess) {
        String email = "\\w+@\\w+(\\.\\w+){1,2}";
        Matcher matcher = Pattern.compile(email).matcher(txt.getText());
        if (matcher.matches()) {
            return false;
        }
        JOptionPane.showMessageDialog(null, mess);
        txt.requestFocus();
        return true;
    }

    public static boolean CheckSDT(JTextField txt, String mess) {
        String sdt = "0\\d{9}";
        Matcher matcher = Pattern.compile(sdt).matcher(txt.getText());
        if (matcher.matches()) {
            return false;
        }
        JOptionPane.showMessageDialog(null, mess);
        txt.requestFocus();
        return true;
    }
     public static void checkDate(JTextField txt, String mess){
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
          
        
        } catch (Exception e) {
        }
        
    }
    
    public static boolean checkId(JTextField txt, String mess) {
        int id;
        id = Integer.parseInt(txt.getText());
        if (id <0) {
            JOptionPane.showMessageDialog(null, mess);
            txt.requestFocus();
            return true;
        }
        return false;
    }
    
}
