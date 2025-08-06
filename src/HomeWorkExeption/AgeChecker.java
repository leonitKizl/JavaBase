package HomeWorkExeption;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) throws LessThan18Exeption {
        System.out.println("Pls enter your age ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18){
            throw new LessThan18Exeption("You are under 18");
        }else {
            System.out.println("You can buy");
        }
    }
}
