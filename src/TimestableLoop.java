import java.util.*;
public class TimestableLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Input a base number: ");
        int number = input.nextInt();

        for (int count=1; count<=12; count++ )
        {
            int answer = (number * count);
            System.out.println(number + " x " + count + " = " + answer);
        }

    }
}
