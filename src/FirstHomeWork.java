import java.util.Scanner;

public class FirstHomeWork {
    public static void Addition(double firstNumber,double secondNumber){
        double sum = firstNumber + secondNumber;
        System.out.println("Addition is " + sum);
    }
    public static void Substraction(double firstNumber,double secondNumber){
        double sub = firstNumber - secondNumber;
        System.out.println("Substraction is " + sub);
    }
    public static void Multiplication(double firstNumber,double secondNumber){
        double multip = firstNumber * secondNumber;
        System.out.println("Multiplication is " + multip);
    }
    public static void Division(double firstNumber,double secondNumber){
        double division = firstNumber / secondNumber;
        System.out.println("Division is " + division);
    }
    public static void Ostatok(double firstNumber,double secondNumber){
        double ostatok = firstNumber % secondNumber;
        System.out.println("Ostatok is " + ostatok);
    }


    public static void main(String[] args) {
        System.out.println("Enter your first number ");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number pls ");
        double secondNumber = scanner.nextDouble();
        Addition(firstNumber,secondNumber);
        Substraction(firstNumber,secondNumber);
        Multiplication(firstNumber,secondNumber);
        Division(firstNumber,secondNumber);
        Ostatok(firstNumber,secondNumber);
    }
}
