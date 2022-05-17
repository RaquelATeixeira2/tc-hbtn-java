public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public void tomarDano(int quantidadeDeDano) {
        if (saudeAtual > 0) {
            saudeAtual = saudeAtual - quantidadeDeDano;
            if (saudeAtual < 0) {
                saudeAtual = 0;
            }
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if (saudeAtual <= 100) {
            saudeAtual = saudeAtual + quantidadeDeCura;
            if (saudeAtual > 100) {
                saudeAtual = 100;
            }
        }
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
        } else  if(saudeAtual == 0){
            this.status = "morto";
        }
        this.saudeAtual = saudeAtual;
    }

    public String getStatus(){
        return status;
    }

}
