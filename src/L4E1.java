import java.util.*;

public class L4E1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name?: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name?: ");
        String lastName = input.nextLine();

        System.out.print("Enter the total value of your order: ");
        double value = input.nextDouble();

        System.out.print("Enter the amount you wish to pay as deposit?: ");
        double deposit = input.nextInt();

        double remainder = (value - deposit);


//        System.out.format("== RECEIPT == \n Customer: " + firstName.substring(0,1) +
//                " " + lastName + "\n Order Total " + value + "\n Deposit Paid " + deposit +
//                "\n Remainder " + remainder );

        System.out.format("== RECEIPT == %n");
        System.out.format("Customer: " + firstName.substring(0,1) + " " + lastName + "%nOrder Total £%.2f%nDeposit Paid £%.2f%nRemainder £%.2f%n",(value), (deposit), (remainder));
//        System.out.format("Order Total £%.2f%n", (value));
//        System.out.format("Deposit Paid £%.2f%n", (deposit));
//        System.out.format("Remainder £%.2f%n", (remainder));

        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }

        System.out.println("Have a nice day!");
    }

}
