package emailApp;
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        firstName = scn.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = scn.nextLine();
        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInformation());
    }
}
