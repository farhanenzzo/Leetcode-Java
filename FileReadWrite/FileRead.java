package FileReadWrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type path: ");
        String path = scanner.nextLine();

        FileReader fileReader = new FileReader(path);
        int data = fileReader.read(); // gets the first idx char as integer byte value

        String output = "";
        while(data != -1) {
            System.out.print((char)data);
            output += (char) data;
            data = fileReader.read();
        }
        fileReader.close();

        FileWriter fileWriter = new FileWriter("/Users/farhanahmed/Documents/javacoding/src/FileReadWrite/output.txt");
        fileWriter.write(output);
        fileWriter.close();

    }
}
