import java.util.Stack;

public class DosCero {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));

    }

    public static boolean isValid(String input) {
        boolean ret = false;

        char[] c = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            switch (c[i]){
                case '(':
                    if(c[i+1] == ')'){
                        ret = true;
                    }else
                        return false;
                case ')':
                    break;

                case '{':
                    if(c[i+1] == '}'){
                        ret = true;
                    }else
                        return false;
                case '}':
                    break;

                case '[':
                    if(c[i+1] == ']'){
                        ret = true;
                    }else
                        return false;
                case ']':
                    break;
            }
        }
        return ret;
    }
}


/**
 * Constraints:
 * El usuario no puede introducir caracteres que no sean parentesis '(){}[]'
 * TODO: con el codigo actual no se pueden anidar, se tiene que poder anidar.
 * Se pueden anidar ({})
 */
/**
 * Ejemplos:
 * 1:
 * Input: s = "()"
 * Output: true
 *
 * 2:
 * Input: s = "()[]{}"
 * Output
 *
 * 3:
 * Input: s = "(]"
 * Output: false
 */


