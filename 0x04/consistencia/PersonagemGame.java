public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtualInicial, String nomeInicial){
        setSaudeAtual(saudeAtualInicial);
    }

    public void tomarDano(int quantidadeDeDano) {
        if (saudeAtual > 0) {
            setSaudeAtual(saudeAtual - quantidadeDeDano);
            if (saudeAtual < 0) {
                setSaudeAtual(0);
            }
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if (saudeAtual <= 100) {
            setSaudeAtual(saudeAtual + quantidadeDeCura);
            if (saudeAtual > 100) {
                setSaudeAtual(100);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            
        }
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
