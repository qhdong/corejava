package v1ch06.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Greeter {
    public void greet(ActionEvent e) {
        System.out.println("Hello, world!");
    }

    public void happy() {
        Timer t = new Timer(1000, this::greet);
        t.start();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.happy();
    }
}

//class TimedGreeter extends Greeter {
//    @Override
//    public void greet() {
//        Timer t = new Timer(1000, super::greet);
//        t.start();
//    }
//}