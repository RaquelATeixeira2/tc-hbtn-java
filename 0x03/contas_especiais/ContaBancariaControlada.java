public class ContaBancariaControlada extends ContaBancariaBasica{
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public void aplicarAtualizacaoMensal(){
        if(getSaldo() < saldoMinimo || getSaldo() <= 0){
            setSaldo(getSaldo() - calcularTarifaMensal() - getSaldoMinimo() + calcularJurosMensal());
        }
    }
    
}
