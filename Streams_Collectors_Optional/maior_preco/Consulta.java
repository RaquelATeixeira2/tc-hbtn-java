import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtos = pedido.getProdutos();

        return produtos.stream()
            .filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
            .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        Optional<Produto> produtosMaiorPreco = produtosPedido.stream().max(Comparator.comparingDouble(Produto::getPreco));
        return max.orElse(null);
    }
}
