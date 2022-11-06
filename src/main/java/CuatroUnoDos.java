import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CuatroUnoDos {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<String>();
        //dado un numero n
        /**
         * devuelve un array de Strings ¿(1-indexed)? donde:
         * answer[i] == "FizzBuzz si i es divisible entre 3 y 5
         * answer[i] == "Fizz" si es divisible entre 3
         * answer[i] == "Buzz" si es divisible entre 5
         * answer[i] ==  i (devolverlo como string) si ninguna de las opciones anteriores es valida
         */

        //recorrer desde 1 hasta n comprobando por cada uno los casos anteriormente descritos
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }else if(i % 3 == 0){
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
