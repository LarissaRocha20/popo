
package aulapoo03;

import javax.swing.JOptionPane;

public class Cachorro implements AnimalEstimacao{
    
    private String nome;
   
    public Cachorro(String nome){
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
        JOptionPane.showMessageDialog(null, "Pega a bola... " + this.nome);
    }
    
}
 // Larissa Rocha - Nº 23