// Swap 2 numbers in java without using temporary variables.
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number #1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number #2");
        int number2 = scanner.nextInt();
        number1 += number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println(number1 + " and " + number2);
    }
}
