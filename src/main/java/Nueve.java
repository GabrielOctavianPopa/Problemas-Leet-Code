public class Nueve {
    public static void main(String[] args) {
        isPalindrome(121);
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        //crear un string con el valor de x
        String initString = String.valueOf(x);
        //recorrer el string desde la ultima posicion hacia atras
        String nuevoString = "";
        for (int i = initString.length() -1; i >= 0; i--) {
            //crear un nuevo string
            nuevoString += initString.charAt(i);
        }
        //comparar el string inicial con el nuevo string
        //si este es igual devolver true
        return initString.equals(nuevoString);
    }
}

/**
 * Dado un integer x devuelve true si x es un palindromo y false si no lo es
 *
 * ejemplo 1:
 * input x = 121
 * output = true
 * explicacion = 121 se lee 121 si lo lees de derecha a izquiera se lee igual
 *
 * ejemplo 2:
 * x = -121
 * output = false
 *
 * ejemplo 3:
 * x = 10
 * output false
 */

/**
 * extension:
 *
 * resuelve el problema sin convertir x a un string
 */

//for con i-- recorriendo el string