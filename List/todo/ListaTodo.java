import java.util.ArrayList;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa t) throws Exception{
        for(Tarefa tarefa : tarefas){
            if(t.getIdentificador() == tarefa.getIdentificador()){
                throw new Exception("Tarefa com identificador " + t.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(t);
    }

    public boolean marcarTarefaFeita(int identificador){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for(Tarefa tarefa : tarefas){
           if(tarefa.isEstahFeita()){
                System.out.println("[X] id: " + tarefa.getIdentificador() + " - Descrição: " + tarefa.getDescricao());
           } else{
            System.out.println("[ ] id: " + tarefa.getIdentificador() + " - Descrição: " + tarefa.getDescricao());
           }
        }
    }

}
