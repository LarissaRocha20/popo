
package aulapoo03;

import javax.swing.JOptionPane;

public class ControleRemoto implements Controlador {
    //Atributos
    private boolean ligado;
    private int volume;
    
    //Métodos Especiais
    ControleRemoto(){
        this.ligado = true;
        this.volume = 50;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public void ligar() {
      if(this.getLigado() == true){
          JOptionPane.showMessageDialog(null, "Já está ligado!");           
      }else{
          this.setLigado(true);
      }   
    } 

    @Override
    public void desligar() {
        if(this.getLigado()== false){
            JOptionPane.showMessageDialog(null, "Já está desligado!");
        } else {
            this.setLigado(false);
        }
    }
    
}
// Larissa Rocha - Nº 23