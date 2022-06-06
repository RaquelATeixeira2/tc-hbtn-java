public class Departamento {
    private static double valorMeta;
    private static double valorAtingidoMeta;
    
    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public static double getValorMeta() {
        return valorMeta;
    }
    public static double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public static boolean alcancouMeta(){
        if(valorAtingidoMeta >= valorMeta){
            return true;
        }
        return false;
    }
    
}
