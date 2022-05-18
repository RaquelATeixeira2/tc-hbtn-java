public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;


    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }


    public void apresentar(){
        System.out.print("Código: " + codigo + "\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("Bairro: " + endereco.getBairro() + "\n");
        System.out.print("Cidade: " + endereco.getCidade() + "\n");
        System.out.print("Pais: " + endereco.getPais() + "\n");
    }
}
