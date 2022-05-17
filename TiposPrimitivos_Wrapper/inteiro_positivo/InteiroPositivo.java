package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor){
        getMessage(valor);
        this.valor = valor;
    }

    public InteiroPositivo(String valor){
        getMessage(Integer.parseInt(valor));
        this.valor = Integer.parseInt(valor);
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        getMessage(valor);
        this.valor = valor;
    }

    public void getMessage(int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public Boolean ehPrimo() {
	    for (int i = 1; i <= this.valor; i++) {
	        if (this.valor % 2 == 0 || this.valor == 1)
	            return false;
	    }
	    return true;
	}
}
