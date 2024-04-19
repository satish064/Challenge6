import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Table calculator\n");
        System.out.print("So, Please enter a number:");
        int Number = input.nextInt();
        System.out.println();
        System.out.println(+ Number + "'s Table: \n");
        for(int i = 1;i<=10;i++) {
            System.out.println(+ Number + " X " + i + " = " +(Number*i));
        }
    }
}
