import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("So, Please Enter a number: ");
        int Number = input.nextInt();
        System.out.println();
        if (isPrime(Number))
            System.out.print("Number is Prime");
        else System.out.print("Number is not Prime");
    }
    public static boolean isPrime(int num) {

        for(int i = 2;i<num;i++) {
            if(num % i == 0)
                return false;
        }
        if(num < 2)
            return false;
        else
        return true;
    }
}
