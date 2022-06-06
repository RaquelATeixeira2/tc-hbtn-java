public class Gerente extends Empregado{
    private double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    
    @Override
    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(Departamento.alcancouMeta()){
            bonus = salarioFixo * 0.2 + (Departamento.getValorAtingidoMeta() - Departamento.getValorMeta() * 0.1);
        }
        return bonus;
    }
}
