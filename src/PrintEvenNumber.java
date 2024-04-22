import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        for(int i = 1;i<10;i++) {
            if(i % 2 == 1)
                continue;
            else
                System.out.println(i);
        }
    }
}
