package v1ch07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.UnknownFormatConversionException;

/**
 * Created by aaron on 16-9-22.
 */
public class ExceptionTest {
    public static void main(String[] args) throws Throwable {
//        try {
//            readFile("Hello");
//        } catch (FileFormatException | UnknownFormatConversionException e) {
//            Throwable se = new MalformedURLException("database error");
//            se.initCause(e);
//            throw se;
//        }

//        System.out.println(f(3));
//        try (Scanner in = new Scanner(new FileInputStream("/usr/share/dict/words"), "UTF-8");
//             PrintWriter out = new PrintWriter("out.txt")) {
//            while (in.hasNext())
//                out.println(in.next().toUpperCase());
//        }

        int x = 3;
        assert x < 0 : "x < 0";
    }

    public static void readFile(String filename) throws FileFormatException {
        throw new FileFormatException("Your file format is not correct.");
    }

    public static int f(int n) {
        try {
            int r = n * n;
            return r;
        } finally {
            if (n == 2)
                return 0;
        }
    }
}
