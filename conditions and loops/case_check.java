
//checking the case of the first letter of the user entered string 
import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        char ch = sc.nextLine().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("the first letter of the word is in lower case");
        } else {
            System.out.println("the first letter in the word is in upper case");
        }
        sc.close();
    }
}
