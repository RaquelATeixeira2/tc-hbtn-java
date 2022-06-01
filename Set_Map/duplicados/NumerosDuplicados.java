import java.util.HashSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros){
        TreeMap<Integer> tset = new TreeMap<Integer>();
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
