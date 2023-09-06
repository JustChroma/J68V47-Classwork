import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("I will add two numbers together!");
        System.out.println("What is the first number: ");
        int num1 = input.nextInt();

        System.out.println("What is the second number: ");
        int num2 = input.nextInt();

        /*int calculation =  (num1 + num2);
        System.out.println("The answer is " + calculation + "!");

         */



        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));



    }
}
