public class While {

    public static void main(String[] args) {
        int number = 10;
        while (number < 20){
            System.out.println(number);
            number++;
        }
        System.out.println();
        int num = 10;
        do {
            System.out.println("number is " + num);
            num--;
        }while (num > 1);
    }
}
