import java.util.*;
public class Receipt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is item 1? ");
        String item1 = input.nextLine();

        System.out.println("How much did it cost? ");
        float cost1 = input.nextFloat();
        input.nextLine();



        System.out.println("What is item 2? ");
        String item2 = input.nextLine();

        System.out.println("How much did it cost? ");
        float cost2 = input.nextFloat();
        input.nextLine();

        System.out.println("What is item 3? ");
        String item3 = input.nextLine();

        System.out.println("How much did it cost? ");
        float cost3 = input.nextFloat();

        System.out.format("NESMART \n" + item1 + "..... £%.2f%n", (cost1));
        System.out.format(item2 + "..... £%.2f%n", (cost2));
        System.out.format(item3 + "..... £%.2f%n", (cost3));


    }
}
