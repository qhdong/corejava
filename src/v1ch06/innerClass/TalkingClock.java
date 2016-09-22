package v1ch06.innerClass;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TalkingClock {

    private int interval;
    private boolean beep;

    TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = this.new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

//    public void start(int interval, final boolean beep) {
//        class TimePrinter implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("At the tone, the time is " + new Date());
//                if (beep) Toolkit.getDefaultToolkit().beep();
//            }
//        }
//
//        ActionListener listener = new TimePrinter();
//        Timer t = new Timer(interval, listener);
//        t.start();
//    }

    public void start(int interval, final boolean beep) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }

    private class TimePrinter implements ActionListener {

        public static final int LIMIT = 10;

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + new Date());
            if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
