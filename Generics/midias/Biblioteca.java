import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    ArrayList<T> listMidia = new ArrayList<>();

    public void adicionarMidia(T midia) {
        this.listMidia.add(midia);
    }

    public ArrayList<T> obterListaMidias() {
        return listMidia;
    }
    
}
