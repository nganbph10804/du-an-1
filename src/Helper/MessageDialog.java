/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MessageDialog {
    public static void showMessageDialog(Component parent,String tilte,String content){
        JOptionPane.showMessageDialog(parent, tilte,content,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorDialog(Component parent,String tilte,String content){
        JOptionPane.showMessageDialog(parent, tilte,content,JOptionPane.ERROR_MESSAGE);
    }
    
    public static int showConfirmDialog(Component parent,String tilte,String content){
        int choose = JOptionPane.showConfirmDialog(parent, tilte,content,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        return choose;
    }
}
