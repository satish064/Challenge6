import java.util.Scanner;

public class SkipNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0;i<5;i++) {
            System.out.printf("Enter the number:");
            int num = input.nextInt();
            if(num < 0)
                continue;
            else sum+=num;
        }
        System.out.printf("Sum = "+sum);
    }
}
