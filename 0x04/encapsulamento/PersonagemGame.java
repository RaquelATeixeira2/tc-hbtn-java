public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public PersonagemGame(int saudeAtual, String nome){
        this.saudeAtual = saudeAtual;
        this.nome = nome;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getSaudeAtual(int saudeAtual){
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
    }


}
