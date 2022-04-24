/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import javax.swing.JOptionPane;
import static wagecalculator.wageInput.*;
/**
 *
 * @author Barry Sinemaue
 */
public class saveData {
    public static void savetoDB() {
        try {
            Dataconnection.wageInput("INSERT INTO `employee`(`Emp_fname`, `Emp_lname`, `Emp_pos`, `Emp_rate`, `Emp_ovrRate`) VALUES ('"+empFname.getText()+"','"+empLname.getText()+"','"+empPos.getText()+"','"+rate.getText()+"','"+overRate.getText()+"')");
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
