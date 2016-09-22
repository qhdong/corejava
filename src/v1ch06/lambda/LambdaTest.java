package v1ch06.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import java.util.function.IntConsumer;

public class LambdaTest {
    public static void main(String[] args) {
//        String[] planets = new String[] {"mercury", "Venus", "Earth", "Mars",
//        "Jupiter", "Saturn", "uranus", "Nepture"};
//        System.out.println(Arrays.toString(planets));
//        Arrays.sort(planets);
//        System.out.println(Arrays.toString(planets));
//        Arrays.sort(planets,
//                (first, second) -> first.length() - second.length());
//        System.out.println(Arrays.toString(planets));
//        Arrays.sort(planets, String::compareToIgnoreCase);
//        System.out.println(Arrays.toString(planets));
//
//
//
//        Timer t = new Timer(1000, System.out::println);
//        t.start();
//
//        LambdaTest.countDown(10, 1000);
//        LambdaTest.repeat(10, () -> System.out.println("╮(╯▽╰)╭"));
        LambdaTest.repeat(10, i -> System.out.println("Countdown: " + (10 - i)));

//        JOptionPane.showMessageDialog(null, "Quit program?");
//        System.exit(0);
    }

    public static void countDown(int start, int delay) {
        ActionListener listener = event -> {
            System.out.println(start);
        };
        new Timer(delay, listener).start();
    }

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }
}
