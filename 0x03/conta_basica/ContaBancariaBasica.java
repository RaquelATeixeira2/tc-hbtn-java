import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao() {
        return numeracao;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }


    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if(valor < 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }

        this.saldo = valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if(valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } 
        if(valor > saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo = saldo - valor;
    }

    public double calcularTarifaMensal(){
        double tarifa10 = 10.0;
        double tarifa10p = saldo * 0.1;
        double tarifa = 0;
        if(tarifa10 > tarifa10p){
            tarifa = tarifa10p;
        } else {
            tarifa = tarifa10;
        }
        return tarifa;
    }

    public double calcularJurosMensal(){
        double jurosM = taxaJurosAnual / 12;
        if(saldo < 0){
            jurosM = 0;
        }
        return jurosM;
    }

    public void aplicarAtualizacaoMensal(){
        this.saldo = (saldo - calcularTarifaMensal()) + calcularJurosMensal(); 
    }
}
