import java.util.*;

public class L3E1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your surname: ");
        String surname = input.nextLine();

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();

        System.out.println("Username: " + firstName.substring(0,1).toUpperCase() + surname.toLowerCase());
        System.out.println("Password: " + surname.substring(0,1).toLowerCase() + firstName.toUpperCase() + yearOfBirth);

    }

}

