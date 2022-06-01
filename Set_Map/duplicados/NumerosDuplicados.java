import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros){
        TreeSet<Integer> tset = new TreeSet<Integer>();
        HashSet<Integer> hset = new HashSet<Integer>();

        for(int n : numeros){
            if(hset.contains(n)){
                tset.add(n);
            }
            hset.add(n);
        }

        return tset;
    }
}
