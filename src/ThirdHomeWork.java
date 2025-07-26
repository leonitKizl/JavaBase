public class ThirdHomeWork {

    public static void main(String[] args) {
        int[] numArray = new int[34];
        int index = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                numArray[index] = i;
                index++;
            }

        }
        System.out.println("Array");

//        for (int i = 0; i < numArray.length; i++) {
//            System.out.println(numArray[i]);
//        }
//        int indexiara = 0;
//        while (numArray[indexiara] < 99) {
//            indexiara++;
//            System.out.println(indexiara + " - " + numArray[indexiara]);
//        }
        int[] reversArray = new int[34];
        int key = 0;

        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.print(numArray[i] + " ");
            reversArray[key] = i;
            key++;
        }
        System.out.println();
        for (int i = 0; i < reversArray.length; i++) {
            System.out.print(reversArray[i] + " ");
        }
    }

}
