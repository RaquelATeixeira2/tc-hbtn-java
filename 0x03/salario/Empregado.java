import java.text.NumberFormat;
import java.util.Locale;
public class Empregado {
    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    NumberFormat numeroFormatado = NumberFormat.getInstance(new Locale("en", "US"));

    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(departamento.alcancouMeta()){
            bonus = salarioFixo * 0.1;
        }
        numeroFormatado.format(bonus);
        return bonus;
    }

    double calcularSalarioTotal(Departamento departamento){
        numeroFormatado.format(salarioFixo);
        return salarioFixo + calcularBonus(departamento);
    }
}
