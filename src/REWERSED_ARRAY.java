public class REWERSED_ARRAY {

    public static void main(String[] args) {
        String[] name = new String[]{"L", "E", "O", "N", "I", "D"};

        for (int i = 0; i < name.length / 2; i++) {
            String ind = name[i];
            name[i] = name[name.length - 1 - i];
            name[name.length - 1 - i] = ind;
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        int[] numbers = new int[]{0, 1, 2, 3, 4};

        for (int j = 0; j < numbers.length / 2; j++) {
            int firstInIterationumber = numbers[j];
            numbers[j] = numbers[numbers.length - 1 - j];
            numbers[numbers.length - 1 - j] = firstInIterationumber;
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }

        System.out.println("My own");

        for (int i = numbers.length - 1; i >=0; i --){
            System.out.print(numbers[i] + " ");
        }
    }
}
