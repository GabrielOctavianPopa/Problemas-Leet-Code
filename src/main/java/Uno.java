public class Uno {
    public static void main(String[] args) {
        int[] nums = {3, 2 ,3};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int salida[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    salida[0] = i;
                    salida[1] = j;
                }
            }
        }
        return salida;
    }

    //devuelve un puntero al array, a leetcode le vale
    //TODO: mostrar el array y no el pointer
}