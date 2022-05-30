import java.io.EOFException;

public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean isEstahFeita() {
        return estahFeita;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void modificarDescricao(String novaDesc) throws Exception{
        if(novaDesc.isEmpty() || novaDesc.equals("")){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = novaDesc;
    }
}
