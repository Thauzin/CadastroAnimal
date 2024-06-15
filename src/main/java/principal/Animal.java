package principal;

public class Animal {
    private String CAF;
    private String nome; 
    private String tipo;
    private String peso;
    
    
    public Animal (String CAF, String nome, String tipo, String peso ){
        this.CAF = CAF;
        this.nome = nome;
        this.tipo = tipo;
        this.peso = peso; 
    }

    public String getCAF() {
        return CAF;
    }

    public void setCAF(String CAF) {
        this.CAF = CAF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    

    public static void main(String[] args) {
        
        
    }
}
