
//this code checks whether the reverse of a number is same as the original number
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to check whether the number is palindrome or not");
        int num = sc.nextInt();

        int original = num; // will store the number in original
        int reverse = 0;

        while (num > 0) {
            int remainder = num % 10; // will fetch out the last value
            reverse = (reverse * 10) + remainder; // store the last fetched value and the reverse of the nunber
            num = num / 10; // trim out the last value
        }

        if (original == reverse) // check if the original is same as reverse
        {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }
        sc.close();
    }
}
