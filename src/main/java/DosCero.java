import java.util.ArrayList;
import java.util.Stack;

public class DosCero {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
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


