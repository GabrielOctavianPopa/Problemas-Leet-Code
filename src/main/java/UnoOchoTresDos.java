import java.util.HashSet;
import java.util.Set;

public class UnoOchoTresDos {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String frase){
        Set<Character> letrasEncontradas = new HashSet<>();

        for (char charActual : frase.toCharArray())
            letrasEncontradas.add(charActual);

        return letrasEncontradas.size() == 26;
    }
}