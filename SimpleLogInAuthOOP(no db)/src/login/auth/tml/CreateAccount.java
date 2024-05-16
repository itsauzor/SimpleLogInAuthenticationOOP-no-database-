
package login.auth.tml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static login.auth.tml.Main.main;

public class CreateAccount {

    private static Scanner scanner = new Scanner(System.in);
    private static List<User> users = new ArrayList<>();

    public static void createAccount(List<User> users) {
        System.out.println("\nCREATE YOUR ACCOUNT");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        User newUser = new User(name, password);
        users.add(newUser);
        System.out.println("Account successfully created!");
        System.out.print("Press Enter to login your account.");
        scanner.nextLine();
	main(users);
 
       }
    }






