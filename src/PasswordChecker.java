import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Set your password");
        String password;
        do {
            System.out.print("Please Enter your password: ");
             password = input.next();
        }while(!isValidPassword(password));

    }
    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
