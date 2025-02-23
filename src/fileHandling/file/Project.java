package fileHandling.file;

import java.io.File;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter project name : ");
        String project = sc.nextLine();
        String path = "C:\\Users\\HP\\Downloads\\";

        // creating folder
        File dir = new File(path+project);

        // creating html file
//        File HtmlFl =

    }
}
