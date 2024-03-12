package login.auth.tml;


import java.util.List;
import java.util.Scanner;

public class LoginAccount {
    private static Scanner scanner = new Scanner(System.in);
    private static List<User> users;
    private static User loggedInUser;

    public static void loginAccount(List<User> userList) {
        users = userList;
        boolean isLoggedIn = false;
      
        while (!isLoggedIn) {
            System.out.println("\nLOG IN YOUR ACCOUNT");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
      
            for (User user : users) {
                if (user.getName().equalsIgnoreCase(name) && user.getPassword().equals(password)) {
                    loggedInUser = user;
		    isLoggedIn = true;
                    System.out.println("You are now logged in!");
                    System.out.print("Press Enter to continue home.");
                    scanner.nextLine();
                    Home.home();                    
                    break;
                }
            }
      
            if (!isLoggedIn) {
                System.out.println("Invalid username or password.");
                System.out.println("Please try again.");
            }
        }
    }  
}
