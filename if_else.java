public class if_else {
    public static void main(String[] args) {

        // single if statement where if a condition is true the block gets executed
        int age = 10;
        if (age < 18) {
            System.out.println("you are a minor");
        }

        // if-else where if the if condition is true the if block executed otherwise the
        // else block executes
        int salary = 25000;
        if (salary <= 25000) {
            salary += 25000;
            System.out.println(salary);
        } else {
            System.out.println("you earn enough");
        }

        // multiple if else
        // in multiple if else the if the if block satisfies the condition it executes
        // the if block and if the else if block's condition is satisfies the else-if
        // block is executed otherwise the else block is executed
        int AGE = 20;
        if (AGE < 18) {
            System.out.println("you are a minor");
        } else if (AGE > 18 && AGE < 60) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are a senior citizen");
        }

    }
}
