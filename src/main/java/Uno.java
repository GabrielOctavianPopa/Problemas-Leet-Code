public class Uno {

    public static void main(String[] args) {
        int[] nums = {3, 2 ,3};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int salida[] = new int[2];
        //bucle con el primer numero
        for(int i = 0; i < nums.length; i++) {
            //bucle con el segundo numero, tiene que acabar este para que se sume 1 al otro
            //System.out.println("bucle 1: " + nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                //System.out.println("bucle 2: " + nums[j]);
                if(nums[i] + nums[j] == target){
                    salida[0] = i;
                    salida[1] = j;
                }
            }
        }
        return salida;
    }
}


/**
 * Dado un array NUMS con enteros y un int target, devuelve los indices de los dos numeros que si los sumas son el target
 * Se puede asumir que cada input tendra exactamente una solucion y que no se puede utilizar el mismo elemento de NUMS dos veces
 * Puedes devolver la respuesta en cualquier orden.
 *
 * Ejemplo 1:
 * Entrada: nums = [2,7,11,15], target = 9
 * Salida: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Ejemplo 2:
 * Entrada: nums = [3,2,4], target = 6
 * Salida: [1,2]
 *
 * Ejemplo 3:
 * Entrada: nums = [3,3], target = 6
 * Salida: [0,1]
 *
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * solo hay una respuesta validad
 */