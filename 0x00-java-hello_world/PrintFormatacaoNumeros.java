import java.text.NumberFormat;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        String valorFormatado = "Valor: " + NumberFormat.getCurrencyInstance().format(valor);
        System.out.printf("%s%n%s%.2f%%%n",valorFormatado, "Taxa: ", taxa);
    }
}
