public class LivroEdicaoOuro extends Livro{
    @Override
    public double getPreco() {
        return preco + (preco * 0.3);
    }
}
