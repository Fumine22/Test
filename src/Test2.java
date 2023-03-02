// Use Scanner in java for user to enter a number and then reverse the number including the zero at the end
// eventually print to console (use loop for).
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        String reverse = "";
        for (int i = 0; i < number.length(); i++) {
            reverse = number.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}
