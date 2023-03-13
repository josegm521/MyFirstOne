/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daysweek;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class DaysWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        number=Integer.parseInt(JOptionPane.showInputDialog("Number 0-6"));
        switch (number) {
            
            case 0:
            JOptionPane.showMessageDialog(null,"It's Monday");    
                break;
            
            case 1:
            JOptionPane.showMessageDialog(null,"It's Tuesday");    
                break;
            
            case 2:
            JOptionPane.showMessageDialog(null,"It's Wednesday");    
                break;
                
            case 3:
            JOptionPane.showMessageDialog(null,"It's Thursday");    
                break;
            
            case 4:
            JOptionPane.showMessageDialog(null,"It's Friday");    
                break;
                
            case 5:
            JOptionPane.showMessageDialog(null,"It's Saturday");
                break;
            case 6:
            JOptionPane.showMessageDialog(null,"It's Sunday");
                break;
    
            default:
                
                JOptionPane.showMessageDialog(null,"Error");    
;
        }
    }
    
}
