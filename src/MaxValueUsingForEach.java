import java.util.Scanner;

public class MaxValueUsingForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};

        int Max = maxArray(arr);

        System.out.println(Max);



    }
    public static int maxArray(int[] arr) {

        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }


}
