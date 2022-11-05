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
