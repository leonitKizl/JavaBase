package File;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File txt = new File("test.txt");
        if (txt.createNewFile()){
            System.out.println("File is created");
        }else {
            System.out.println("File already created");
        }
    }
}
