public class NumerosPares {
    public static void main(String[] args){
        int i;
        for(i = 0; i <=100; i++){
            if(i%2==0){
                if(i == 100){
                    System.out.print(i+"\n");
                } else{
                    System.out.print(i+", ");
                }
            }
        }
    }
}
