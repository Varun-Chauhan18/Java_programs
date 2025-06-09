import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to find the factorial");
        int num = sc.nextInt();

        int fac = 1;
        while (num > 0) {
            fac = num * fac;
            num = num - 1;
        }
        System.out.println(fac);

        sc.close();
    }
}
