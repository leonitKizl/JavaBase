import java.util.Scanner;

public class CalculatorMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
       double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number ");
       double secondNumber = scanner.nextDouble();

       Calculator scannerNumbers = new Calculator();
       scannerNumbers.addition(firstNumber,secondNumber);
       scannerNumbers.substraction(firstNumber,secondNumber);
       scannerNumbers.multiplication(firstNumber,secondNumber);
       scannerNumbers.division(firstNumber,secondNumber);
       scannerNumbers.modulo(firstNumber,secondNumber);


    }
}
