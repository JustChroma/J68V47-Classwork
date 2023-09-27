import java.util.*;

public class L3E1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();

        System.out.print("Username: " + firstName.substring(0,1).toUpperCase() + surname.toLowerCase());
        System.out.print("Password: " + surname.substring(0,1).toLowerCase() + firstName.toUpperCase() + yearOfBirth);

    }

}

