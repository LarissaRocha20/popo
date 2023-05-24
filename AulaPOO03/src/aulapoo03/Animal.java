
package aulapoo03;

import javax.swing.JOptionPane;

public class Animal {
    
    protected int pernas;
    
    public Animal(){
        this.pernas = 0;
    } 
    
    public void caminha(){
        JOptionPane.showMessageDialog(null, "Ele caminha!!");
    }
    
    public void come(){
        JOptionPane.showMessageDialog(null, "Ele come!!");
    }    
}
 // Larissa Rocha - Nº 23