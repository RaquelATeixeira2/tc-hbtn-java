public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(3 <= titulo.length()){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!autor.contains(" ")) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(0 < preco){
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }

    
    
    
}
