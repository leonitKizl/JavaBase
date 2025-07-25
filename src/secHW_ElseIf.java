import java.util.Scanner;

public class secHW_ElseIf {

    public static void main(String[] args) {
        System.out.println("Enter your age to by alcohol");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18 && age < 100){
            System.out.println("You can by alco");
        } else if (age < 18 && age >0) {
            System.out.println("You can not by it");
        } else if (age < 0) {
            System.out.println("Pls enter real age");
        } else {
            System.out.println("You can not be older than 100");
        }
    }
}
