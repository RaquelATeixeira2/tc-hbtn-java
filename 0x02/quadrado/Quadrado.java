public class Quadrado {
    public static void area(int a, int b){
        int area = 0;
       if(a > 0 && b > 0){
            area = a * b;
       } else{
           throw new IllegalArgumentException("Lado deve possuir valor positivo");
       }
    }
}
