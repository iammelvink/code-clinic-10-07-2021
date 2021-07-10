package fileiodowhileloop;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Scanner;

public class FileIODoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\Admin\\Documents\\GKSS\\CodeClinic10_07_2021\\CodeC.txt");
        // QUIT = to stop the loop
        // s = variable to hold contents from prompt
        String Quit = "t", s;

        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(out));
            // loop will run AT LEAST one times
            do {
                System.out.print("Enter Names --> ");
                s = input.nextLine();
                if (!s.equalsIgnoreCase(Quit)) {
                    wr.write(s);
                }
                wr.newLine();
            } while (!s.equalsIgnoreCase(Quit));

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
