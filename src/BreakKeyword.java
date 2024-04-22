import java.util.Scanner;

public class BreakKeyword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[5];
        for(int i = 0; ;i++) {
            System.out.print("Enter a Character Name(For Exit Type 'Exit'):");
            String character = input.next();
            array[i] = character;
            if(character.equals("Exit"))
                break;
        }
    }
}
