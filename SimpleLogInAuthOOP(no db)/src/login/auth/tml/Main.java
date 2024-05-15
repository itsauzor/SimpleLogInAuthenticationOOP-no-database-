
package login.auth.tml;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Main log_auth = new Main();

     public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        log_auth.main(users);
    }

        public static void main(List<User> users) {
        System.out.println("\nSIMPLE LOGIN AUTHENTICATION");
        System.out.println("1. Create account");
        System.out.println("2. Login account");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                CreateAccount.createAccount(users);
                break;
            case 2:
	        LoginAccount.loginAccount(users);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                main(users);
                break;
        }
    }

}


