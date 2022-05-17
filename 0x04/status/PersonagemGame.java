public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public void tomarDano(int quantidadeDeDano) {
        saudeAtual = saudeAtual - quantidadeDeDano;
    }

    public void receberCura(int quantidadeDeCura) {
        saudeAtual = saudeAtual + quantidadeDeCura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if(saudeAtual > 0){
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
        this.saudeAtual = saudeAtual;
    }

    public String getStatus(){
        return status;
    }

}
