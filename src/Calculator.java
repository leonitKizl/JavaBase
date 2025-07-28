public class Calculator {

    public double addition(double firstNumber, double secondNumber) {
        double additionOfNumbers = firstNumber + secondNumber;
        System.out.println("Addition of numbers is " + additionOfNumbers);
        return additionOfNumbers;
    }

    public double substraction(double firstNumber, double secondNumber) {
        double substractionOfNumbers = firstNumber - secondNumber;
        System.out.println("Substraction of numbers is " + substractionOfNumbers);
        return substractionOfNumbers;
    }

    public double division(double firstNumber, double secondNumber) {
        double divisionOfNumbers = firstNumber / secondNumber;
        if (secondNumber == 0) {
            System.out.println("Second number couldnt be equal 0");
        } else {
            System.out.println("Division is " + divisionOfNumbers);
        }
        return divisionOfNumbers;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        double multiplicationOfNumbers = firstNumber * secondNumber;
        System.out.println("Multiplication of numbers is " + multiplicationOfNumbers);
        return multiplicationOfNumbers;
    }

    public double modulo(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Second number couldnt be = 0");
        } else {
            System.out.println("Modulo of numbers is " + firstNumber % secondNumber);
        }
        double moduloOfNumbers = firstNumber % secondNumber;
        return moduloOfNumbers;

    }

}
