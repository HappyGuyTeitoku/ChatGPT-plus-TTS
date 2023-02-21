import java.util.Scanner;

public class UserInterface {
    public static void Welcome() {
        System.out.println("Welcome to my program");
    }

    public static void Line() {
        System.out.println("\n========== ========== ==========\n");
    }

    public void WelcomeScreen(){
        Line();
        Welcome();
        Line();
    }

    static String AskForQuestion = "Please enter a question\nOr \"quit\" to exit\n> ";

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(AskForQuestion);
        String Questring = scanner.nextLine();
        // scanner.close();
        return Questring;
    }
}
