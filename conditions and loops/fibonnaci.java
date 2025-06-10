import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number till where u want to print the fibonnaci series");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }

        sc.close();
    }
}
