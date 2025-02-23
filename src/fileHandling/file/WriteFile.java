package fileHandling.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // creating file
        File fl = new File("C:\\Users\\HP\\Downloads\\write_me.txt");
        fl.createNewFile();

        System.out.println("Kuch data do : ");
        String data = sc.nextLine();

        // writing in file
        FileWriter fw = new FileWriter(fl);
        fw.write(data.trim());
        fw.close();


    }
}
