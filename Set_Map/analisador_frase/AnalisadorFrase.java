import java.util.TreeMap;
public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemDePalavras(String frase){
        TreeMap<String, Integer> mapP = new TreeMap<String, Integer>();

        String tratada = frase.replace("[?!.]", "");
        String [] pTratada = tratada.split("");

        for(String palavraTratada : pTratada){
            if (mapPalavras.containsKey(palavra.toLowerCase())) {
                mapPalavras.put(palavra.toLowerCase(), mapPalavras.get(palavra.toLowerCase()) + 1);
            } else {
                mapPalavras.put(palavra.toLowerCase(), 1);
            }
        }
        return mapP;  
    }
}
