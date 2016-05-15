package forca;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Pessoa {

    public  int vida = 6;
    private Image pessoaDesenho;
    private Image pessoaDesenhoMorto;
    private Image pessoaDesenhoVivo;

    public Image getPessoaDesenhoVivo() {
        return pessoaDesenhoVivo;
    }

    public void setPessoaDesenhoVivo(Image pessoaDesenhoVivo) {
        this.pessoaDesenhoVivo = pessoaDesenhoVivo;
    }
    
    public Image getPessoaDesenhoMorto() {
        return pessoaDesenhoMorto;
    }

    public void setPessoaDesenhoMorto(Image pessoaDesenhoMorto) {
        this.pessoaDesenhoMorto = pessoaDesenhoMorto;
    }
    
    private boolean emJogo;
    private boolean vencedor = false;

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }
    
    public boolean isEmJogo() {
        return emJogo;
    }

    public void setEmJogo(boolean emJogo) {
        this.emJogo = emJogo;
    }
    

    public Image getPessoaDesenho() {
        return pessoaDesenho;
    }
    
    public Pessoa() {
        setEmJogo(true);
    }
    
    public void desenhaPersonagem(){
        ImageIcon referencia;
        
        if(getVida() == 5){
             referencia = new ImageIcon(this.getClass().getResource("/res/enforca_1.gif"));
        } else if(getVida() == 4) {
            referencia = new ImageIcon(this.getClass().getResource("/res/enforca_2.gif"));
        } else if(getVida() == 3) {
            referencia = new ImageIcon(this.getClass().getResource("/res/enforca_3.gif"));
        } else if(getVida() == 2) {
            referencia = new ImageIcon(this.getClass().getResource("/res/enforca_4.gif"));
        } else if(getVida() == 1) {
            referencia = new ImageIcon(this.getClass().getResource("/res/enforca_5.gif"));
        } else if(getVida() == 0) {
            referencia = new ImageIcon(this.getClass().getResource("/res/enforca_6.gif"));
        }else{
            referencia = new ImageIcon(this.getClass().getResource("/res/enforcado_total.gif"));
        }
       
        pessoaDesenho = referencia.getImage();
    }
    
    public void desenhaPersonagemMorto(){
        ImageIcon referencia;
        ImageIcon referenciaInicio = new ImageIcon(this.getClass().getResource("/res/enforcado_total.gif"));
        referencia = new ImageIcon(this.getClass().getResource("/res/Enforcado.gif"));   
        pessoaDesenho = referenciaInicio.getImage();
        pessoaDesenhoMorto = referencia.getImage();
    }
    
    public void desenhaPersonagemVivo(){
        ImageIcon referencia;
        ImageIcon referenciaInicio = new ImageIcon(this.getClass().getResource("/res/Forca__19.gif"));
        referencia = new ImageIcon(this.getClass().getResource("/res/homem_livre.gif"));   
        pessoaDesenho = referenciaInicio.getImage();
        pessoaDesenhoVivo = referencia.getImage();
    }
    
    /**
     * Retira uma vida do personagem , caso não tenha mais finaliza o jogo
    */
    public void retiraVida() {
        if(this.vida > 1){
            this.vida = this.vida - 1;
        }else{
            this.vida = 0;
            setEmJogo(false);
        }
    }

    public int getVida() {
        return vida;
    }
    
    /**
     * Caso for Localizado o caractere _
     * ainda falta palavras para serem descobertas
    */
    public boolean venceuJogo(String palavra){
        boolean vencedor = true;
        char[] palavraOculta = palavra.toCharArray();
        
        for (int i = 0; i < palavra.length(); i++) {
            if('_' == palavraOculta[i]){
                vencedor = false;
            }          
        }
       
        return vencedor;
    }
    
   public Rectangle getBounds(){
        return new Rectangle(1, 1, 1, 1);
    }
    
  
}
