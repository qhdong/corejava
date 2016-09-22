package v1ch06.innerClass;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, false);
//        clock.start();
        clock.start(2000, true);

        ArrayList<String> friends = new ArrayList<String>() {{
            add("Jack");
            add("Tommy");
        }};

        System.out.println(friends);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
