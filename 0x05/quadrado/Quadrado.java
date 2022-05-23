public class Quadrado extends Retangulo{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado < 0){
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
        this.lado = lado;
        this.largura = largura;
        this.altura = altura;
        }
    }


    @Override
    public String toString() {
        String r = String.format("[Quadrado] %.2f", lado);
        return r;
    }
    
}
