import java.util.HashMap;

public class TresOchoTres {
    public static void main(String[] args) {
        System.out.println(canConstruct("abanico", "bobina"));
    }

    //dado dos strings, ransomNote y Magazine
    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ransomNote.length(); i++) {
            char actChar = ransomNote.charAt(i);
            for (int j = 0; j < magazine.length(); j++) {

            }
        }

        //devuelve true si se puede construir la ransomNote con las letras que haya en magazine
        //si no, devuelve false
        return false;
    }
}
