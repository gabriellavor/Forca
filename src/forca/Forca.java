package forca;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Forca extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private Image fundo;
    private Pessoa pessoa;
    private Palavra palavra;
    
    public Forca() {
        setFocusable(true);
        setDoubleBuffered(true);
        //Defino o Fundo da Imagem
        ImageIcon referencia = new ImageIcon(this.getClass().getResource("/res/fundo.png"));
        fundo = referencia.getImage();
        //Adiciono o Listener para escutar o teclado
        addKeyListener(new TecladoAdapter());
        pessoa = new Pessoa();
        palavra = new Palavra();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        Font fonteTentarNovamente = new Font ("Courier New", 1, 17);
        Font fontePalavra = new Font ("Courier New", Font.BOLD, 30);
        //Coloco o fundo na tela
        graficos.drawImage(fundo, 0, 0, null);
        //Escrevo a quantidade de Vida
        graficos.setFont (fontePalavra);
        graficos.setColor(Color.RED);
        graficos.drawString("Vida: " + pessoa.getVida(), 5, 30);
        //Palavra a ser descoberta
        
        graficos.drawString("Palavra: " + palavra.espacamentoPalavra(palavra.getPalavraEscondida()), 270, 300);
        graficos.drawImage(pessoa.getPessoaDesenho(), 127, 125, this);
        //verifico o fim do jogo , e se foi porque perdeu ou venceu
        if(palavra.isLetraJaDigitadas()){
            graficos.setColor(Color.RED);
            graficos.drawString("Letra Já foi Digitada", 300, 180);
        }
        System.out.println();
        char[] letraDigitadas = palavra.getLetraDigitadas();
        graficos.setColor(Color.ORANGE);
        for (int i = 0; i < letraDigitadas.length; i++) {
           graficos.drawString(Character.toString(letraDigitadas[i]), 300  + i * 20, 520);
        }
        
        graficos.drawString(palavra.getDica(), 300, 140);
        
        if(!pessoa.isEmJogo() && !pessoa.isVencedor()){            
            graficos.drawImage(pessoa.getPessoaDesenhoMorto(), 30, 130, this);
            graficos.setFont (fonteTentarNovamente);
            graficos.setColor(Color.RED);
            graficos.drawString("Você Morreu !", 300, 170);
            graficos.drawString("Tecle Enter Para Jogar Novamente", 300, 200); 
            
        }else if(!pessoa.isEmJogo() && pessoa.isVencedor()){
            graficos.drawImage(pessoa.getPessoaDesenhoVivo(), 0, 230, this);
            graficos.setFont (fonteTentarNovamente);
            graficos.setColor(Color.GREEN);
            graficos.drawString("Você Venceu !", 300, 170);
            graficos.drawString("Tecle Enter para Jogar Novamente", 300, 200);
        }
        g.dispose();
    }
    

    private class TecladoAdapter extends KeyAdapter {
        @Override
        
        public void keyPressed(KeyEvent e) {
            Object someKeyCodeObject = new Integer(e.getKeyCode());
            char letraDigitada[] = KeyEvent.getKeyText((Integer)someKeyCodeObject).toCharArray();
            
                       
            //Caso for fim de jogo o mesmo reinicia dando Enter
            if(!pessoa.isEmJogo()){
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    pessoa.setEmJogo(true);
                    pessoa = new Pessoa();
                    palavra = new Palavra();
                }
            }else{
                //Pego o Range de A-Z
                if(e.getKeyCode() >= KeyEvent.VK_A  && e.getKeyCode() <= KeyEvent.VK_Z){
                    //Se acertou mostra a letra acertada
                    if(palavra.acertouLetra(letraDigitada[0])){
                        palavra.mostraLetra();
                    }else{
                        //se errou retira a vida e desenha o personagem na forca
                        pessoa.retiraVida();
                        pessoa.desenhaPersonagem();
                    }
                }
            }
           
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //cada vez a tecla for desprecionada verifica se o jogo foi vencido,caso sim finaliza
            if(pessoa.venceuJogo(palavra.getPalavraEscondida())){
                pessoa.setEmJogo(false);
                pessoa.setVencedor(true);
            }
            if(!pessoa.isEmJogo() && !pessoa.isVencedor()){
                pessoa.desenhaPersonagemMorto();                
            }else if(!pessoa.isEmJogo() && pessoa.isVencedor()){
                pessoa.desenhaPersonagemVivo();
            }
            
            repaint();
        }
    }
}
