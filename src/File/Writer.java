package File;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("First raw");
        writer.write("Second raw");
        writer.close();

    }
}
