package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    public static void main(String[] args){
       Integer valor;
       valor = 0;
       String v = Integer.toString(valor);

    }

    public static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
