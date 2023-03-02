import java.util.Scanner;

//  Create an ATM program to view basic ATM transactions:
//      In the ATM program, users must choose an option from the transaction options displayed on the screen. The transaction options include withdrawing money, depositing money, checking the balance, and exiting.
//      To withdraw money: The ATM only needs to take the amount to be withdrawn from the user and subtract it from the total balance, then print a success message.
//      To deposit money: The ATM only needs to take the amount to be deposited from the user, add it to the total balance, and print a success message.
//      To check the balance: The ATM only needs to print the total balance of the user.
//      The ATM uses the exit(0) method to exit the current transaction mode and return the user to the home or initial screen.
//      Note: Test 3. Only users who choose the exit option and then exit, if not showing the options for user.
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();
        try {
            while (true) {
            System.out.println("Choose 1 to withdraw");
            System.out.println("Choose 2 to deposit");
            System.out.println("Choose 3 to check your balance");
            System.out.println("Choose 4 to exit");
            System.out.println("Choose the number to continue: ");
            int number = scanner.nextInt();
            if (number > 0 && number < 4) {
//                Rút tiền (Withdraw money)
                    if (number == 1) {
                        System.out.println("Enter amount you want to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (balance - withdrawAmount < 0) {
                            System.out.println("You don't have enough in your account. Your balance: " + balance);
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Success!! Your remaining balance = " + balance);
                        }
                        System.out.println("Press 0 to exit");
                        System.out.println("Press 1 to continue");
                        number = scanner.nextInt();
                        if (number == 0) {
                            break;
                        } if (number == 1) {
                            continue;
                        }
                    }
//                Gửi tiền (Deposit money)
                    if (number == 2) {
                        System.out.println("Enter amount you want to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        balance += depositAmount;
                        System.out.println("Success!! Your remaining balance = " + balance);
                        System.out.println("Press 0 to exit");
                        System.out.println("Press 1 to continue");
                        number = scanner.nextInt();
                        if (number == 0) {
                            break;
                        } if (number == 1) {
                            continue;
                        }
                    }
//                Kiểm tra số dư (Check balance)
                    if (number == 3) {
                        System.out.println("Your remaining balance = " + balance);
                        System.out.println("Press 0 to exit");
                        System.out.println("Press 1 to continue");
                        number = scanner.nextInt();
                        if (number == 0) {
                            break;
                        } if (number == 1) {
                            continue;
                        }
                    }
//                Thoát (Exit)
                    if (number == 4) {
                        break;
                    }
                } else {
                break;
            }
            }
        } catch (NumberFormatException exception) {
            System.out.println("Can't access!" + exception);
        }
    }
}
