public class Array {

    public static void main(String[] args) {
        String[] names = new String[]{"John", "Wiki", "Leo"};
//        names[0] = "John";
//        names[1] = "Wiki";
//        names[2] = "Leo";
        System.out.println(names[2]);

        int[] numbers = new int[]{0, 1, 2, 3};
        System.out.println(numbers[2]);
        System.out.println("LOOOP");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].toUpperCase() + " ");
        }
        System.out.println();
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(j + " ");
        }
    }
}
