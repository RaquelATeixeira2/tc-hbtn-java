import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat numeroFormatado = NumberFormat.getInstance(new Locale("en", "US"));
        String val = "Valor: R$ " + numeroFormatado.format(valor);
        System.out.printf("%s%n%s%.2f%%%n",val.substring(0, 18), "Taxa: ", taxa);
    }
}
