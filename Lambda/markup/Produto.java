import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;
    public Supplier<Double> precoComMarkup;
    public Consumer<Double> atualizarMarkUp = x -> this.percentualMarkUp = x;


    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public double getPercentualMarkup() {
        return percentualMarkup;
    }


    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }


    public Consumer<Double> getAtualizarMarkUp() {
        return atualizarMarkUp;
    }

    
    
}
