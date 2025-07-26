import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dish = scanner.nextLine();

        switch (dish) {
            case "pizza":
                System.out.println("Pizza costs 20 ");
                break;
            case "sushi":
                System.out.println("Sushi cost 30");
                break;
            default:
                System.out.println("We dont have this dish");
        }
    }}

