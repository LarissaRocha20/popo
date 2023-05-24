
package aulapoo03;

import javax.swing.JOptionPane;

public class ClassePrin {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do Dog!");
        Cachorro c1 = new Cachorro(nome);
        c1.brinca();
        
        String nomeP = JOptionPane.showInputDialog("Digite o nome do Peixe!");
        Peixe p1 = new Peixe(nomeP);
        p1.brinca();
        
    }
} // Larissa Rocha - Nº 23
