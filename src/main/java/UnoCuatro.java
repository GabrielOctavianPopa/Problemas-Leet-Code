import java.util.Arrays;

public class UnoCuatro {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        //System.out.println(longestCommonPrefix(strs));
        longestCommonPrefix(strs);
    }
    public static String longestCommonPrefix(String[] strs) {
        //si el array de strings no está inicializado o esta vacio devolvemos LCP: "". (longest common prefix)
        if(strs == null || strs.length == 0)
            return "";

        //ordenamos el array para poder trabajar más fácilmente con él
        Arrays.sort(strs); //como es un array de strings estos se ordenan alfabéticamente
        String frstWord = strs[0];
        String lastWord = strs[strs.length - 1];
        int chara = 0; // caracter

        while (chara < frstWord.length()){
            //como están ordenados alfabéticamente nos interesan solo la primera y la ultima palabras
            if(frstWord.charAt(chara) == lastWord.charAt(chara)){ // loop para comparar caracter por caracter las palabras
                chara++; //si estos coinciden añadimos el numero de letras que coinciden
            }
            else
                break;
        }

        //operador ternario, si el numero de caracteres que coinciden es 0 devolvemos: "",
        // si es mayor que 0 sacamos el substring de la primera palabra, desde la letra 0 al número de caracteres que coinciden
        return chara == 0 ? "" : frstWord.substring(0, chara);
    }
}