/*
 * Alăng Quân Sỹ
 * PD09903
 * https://ap.poly.edu.vn
 */
package com.mycompany.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Just Share
 */
public class MsgBox {
    public static void alert(Component parent, String mesage){
        JOptionPane.showMessageDialog(parent, mesage, "Phần mềm quản lý xe máy", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component parent, String  message){
        int result = JOptionPane.showConfirmDialog(parent, message,"Phần mềm quản lý xe máy",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message,"Phần mềm quản lý xe máy",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
