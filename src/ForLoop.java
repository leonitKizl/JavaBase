public class ForLoop {

    public static void main(String[] args) {
        int number = 13;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println("modulo 3 = " + i);
            }
            System.out.println(i);
        }
        String name = "LEONIDOSINA";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        for (int j = name.length() - 1; j >= 0; j--) {
//            System.out.println(j);
            System.out.print(name.charAt(j));
        }
    }
}
