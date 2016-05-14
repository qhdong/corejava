package v1ch03;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        String path = "/Users/aaron/Study/Java/corejava/src/v1ch03/myfile.txt";
//        Scanner in = new Scanner(Paths.get(path), "UTF-8");
//        System.out.println(in.nextLine());
        PrintWriter out = new PrintWriter(path, "UTF-8");
        out.printf("%1$s %2$tY %2$tB %2$te %n", "Due Date:", new Date());
        out.flush();
    }
}
