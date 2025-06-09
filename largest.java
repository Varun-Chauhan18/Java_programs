// code to check the largest number using conditional statements

//import the scanner class to scan the user input
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter first number");
        int b = sc.nextInt();
        System.out.println("enter first number");
        int c = sc.nextInt();

        int max = a;// assume the max is a

        if (b > max) {
            max = b; // assign max to b if b in greater than max
        }
        if (c > max) {
            max = c; // assign max to c if c in greater than max
        }
        System.out.println(max); // return max
        sc.close();
    }

}
