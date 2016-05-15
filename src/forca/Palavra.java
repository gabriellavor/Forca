package forca;

public class Palavra {
    
    private String palavraEscolhida;
    private String palavraEscondida;
    private String[] palavrasPossiveis = {
        "BRASIL","CHAVES","DILMA","CUBA","EGITO","MORCEGO","RUSSIA","CHILE","ALEMANHA","EQUADOR","INGLATERRA"
    };
    private String[] dicasPossiveis = {
        "Tomou 7 X 1","Iso,Iso,Iso","Tchau Querida","Sua capital é Havana","Sua capital é Cairo","BATMAN","Sua capital é Moscou","Sua capital é Santiago","Sua capital é Berlim","Sua capital é Quito","Sua capital é Londres"
    };
    private String dica;

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
    
    public String[] getDicasPossiveis() {
        return dicasPossiveis;
    }
    public boolean isLetraJaDigitadas() {
        return letraJaDigitadas;
    }

    public void setLetraJaDigitadas(boolean letraJaDigitadas) {
        this.letraJaDigitadas = letraJaDigitadas;
    }
    private boolean letraJaDigitadas = false;
    private char[] letraDigitadas = new char[100];

    public char[] getLetraDigitadas() {
        return letraDigitadas;
    }

    public void setLetraDigitadas(char[] letraDigitadas) {
        this.letraDigitadas = letraDigitadas;
    }

  
    public String[] getPalavrasPossiveis() {
        return palavrasPossiveis;
    }
    
    public Palavra(){       
        this.palavraEscolhida = escolhePalavra();
        this.palavraEscondida = esconderPalavra(this.palavraEscolhida);
        for (int i = 0; i < 100; i++) {
            this.letraDigitadas[i] = ' ';
        }
    }
    
    public String escolhePalavra(){
        int numero = (int)(Math.random() * 11);
        String[] escohePalavra = getPalavrasPossiveis();
        String[] escolheDica = getDicasPossiveis();
        setDica(escolheDica[numero]);
        return escohePalavra[numero];
    }

    public void setDicasPossiveis(String[] DicasPossiveis) {
        this.dicasPossiveis = DicasPossiveis;
    }
    
    
    public boolean acertouLetra(char letra){
        boolean acertou = false;
        boolean vencedor = true;
        String novaPalavra = "";
        char[] palavraOculta = getPalavraEscondida().toCharArray();
        
       
        boolean existeLetra = false;
        for (int i = 0; i < getLetraDigitadas().length; i++) {
            for (int j = 0; j < getLetraDigitadas().length; j++) {
                if(this.letraDigitadas[i] == letra){
                   existeLetra = true;
                }
            }
            if(!existeLetra){
                setLetraJaDigitadas(false);
                if(this.letraDigitadas[i] == ' ' ){
                    this.letraDigitadas[i] = letra;
                    break;
                } 
            } else{
                setLetraJaDigitadas(true);
                return true;
            }
        }
        
        String palavra = getPalavraEscolhida();
        char[] palavraArray = palavra.toCharArray();  
        
        for (int i = 0; i < palavra.length(); i++) {
            if('_' == letra){
                vencedor = false;
            }
            if(palavraArray[i] == letra){
                acertou = true;
                palavraOculta[i] = letra;
            }
            
            novaPalavra += palavraOculta[i];
        }
        if(vencedor){
            Pessoa pessoa = new Pessoa();
            pessoa.setVencedor(true);
            pessoa.setEmJogo(false);
        }
        setPalavraEscondida(novaPalavra);
        return acertou;
    }
    
    public void mostraLetra(){
    }

    public String getPalavraEscolhida() {
        return palavraEscolhida;
    }

    public void setPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
    }

    public String getPalavraEscondida() {
        return palavraEscondida;
    }

    public void setPalavraEscondida(String palavraEscondida) {
        this.palavraEscondida = palavraEscondida;
    }
    
    public String espacamentoPalavra(String palavra){
        String novaPalavra = "";
        char[] palavraArray = palavra.toCharArray();  
        for (int i = 0; i < palavra.length(); i++) {
            novaPalavra += palavraArray[i]+" ";
        }
        return novaPalavra;
    
    }    
    
    public String esconderPalavra(String palavra){
        String novaPalavra = "";
        
        for (int i = 0; i < palavra.length(); i++) {
            novaPalavra += "_";
        }
        return novaPalavra;
    }
    
    
}
