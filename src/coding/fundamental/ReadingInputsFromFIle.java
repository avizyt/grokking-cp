package coding.fundamental;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingInputsFromFIle {
    public static void main(String[] args) {
        try {
            File file = new File("./data/input.txt");
            Scanner sc = new Scanner(file);
            // BufferedReader br = new BufferedReader(file);
            // PrintWriter out = new PrintWriter(System.out);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Line: " + line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
