
package aulapoo03;

import javax.swing.JOptionPane;

public class Peixe implements AnimalEstimacao{
    private String nome;
    
    public Peixe(String nome){
        this.nome = nome;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void brinca() {
        JOptionPane.showMessageDialog(null, "Continue a nadar... " + this.nome);
    }
    
}
 // Larissa Rocha - Nº 23