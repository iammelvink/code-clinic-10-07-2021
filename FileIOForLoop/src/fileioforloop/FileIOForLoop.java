package fileioforloop;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Scanner;

public class FileIOForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\Admin\\Documents\\GKSS\\CodeClinic10_07_2021\\CodeC.txt");

        // String s = "12333, , 45446" + System.getProperty("line.separator");
        // String s [] = {"TLOTLANG","LEMOGANG","SMOUS","WISE","WISEMAN"};
        // s[] = variable to hold contents from prompt
        String s[] = new String[5];

        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(out));
            for (int i = 0; i < s.length; i++) {
                System.out.print("Enter Names --> ");
                s[i] = input.nextLine();
                wr.write(s[i]);
                wr.newLine();

            }

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

}
