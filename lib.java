import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Library Management System");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (login(username, password)) {
            System.out.println("Access Granted");
            showMenu();
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }

    // Login function – access control
    static boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("admin123");
    }

    // Functions accessible only after login
    static void showMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Issue Book");
    }
}
