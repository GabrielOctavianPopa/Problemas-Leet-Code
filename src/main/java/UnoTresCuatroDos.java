public class UnoTresCuatroDos {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    //dado un numero
    public static int numberOfSteps(int num) {
        int pasos = 0;
        while(num != 0){
            //si el numero es par, dividir entre 2
            if(num % 2 == 0){
                num = num / 2;
                pasos++;
            } else{ //si es impar, restarle uno
                num = num - 1;
                pasos++;
            }
        }
        //devuelve el numero de pasos para reducirlo a 0
        return pasos;
    }
}
