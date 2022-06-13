public class Pessoa {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private int salario;
    
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public int getIdade() {
        return idade;
    }
    public int getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "[" + this.codigo + "] " + " " + this.nome + " " + this.cargo + " R$" + this.salario;
    }
}
