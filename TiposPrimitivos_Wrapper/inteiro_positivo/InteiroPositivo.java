package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    public static void main(String[] args){
        InteiroPositivo InteiroPositivo = new InteiroPositivo();

        int valor = 0;
        

    }

    public static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
