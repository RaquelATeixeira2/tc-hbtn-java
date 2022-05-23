public class Livro extends Produto{
    private int paginas;
    private String autos;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autos, int edicao) {
        super.titulo = titulo;
        super.ano = ano;
        super.pais = pais;
        super.precoBruto = precoBruto;
        this.paginas = paginas;
        this.autos = autos;
        this.edicao = edicao;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public String getAutos() {
        return autos;
    }
    public void setAutos(String autos) {
        this.autos = autos;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido(){
        double preco = precoBruto + (precoBruto * 15/100);
        return preco;
    }
}
