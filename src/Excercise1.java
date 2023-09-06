import java.util.*;
public class Excercise1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = input.nextLine();

        System.out.print("What is your favourite hobby? ");
        String hobby = input.nextLine();

        /*System.out.println("Your name is " + firstName + " and your favourite hobby is " + hobby + "!");

         */
        String story = firstName + "'s ancestors endured millions of years worth of pain and joy for " + firstName + " to enjoy " + hobby + "!";
        System.out.println(story);


    }
}
