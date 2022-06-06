import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

    ArrayList<Post> listaPostagem = new ArrayList<Post>();

    public void adicionarPostagem(Post post) {
        this.listaPostagem.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();

        for(Post p : listaPostagem){
            autores.add(p.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String,Integer> mapaContagem = new TreeMap<String,Integer>();

        for (Post post : listaPostagem) {
            if (mapaContagem.containsKey(post.getCategoria())) {
                Integer conta = mapaContagem.get(post.getCategoria());
                mapaContagem.put(post.getCategoria(), conta + 1);
            } else {
                mapaContagem.put(post.getCategoria(), 1);
            }
        }

        return mapaContagem;
    }
}
