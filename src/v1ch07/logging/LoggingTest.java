package v1ch07.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aaron on 16-9-22.
 */
public class LoggingTest {

    private static final Logger logger = Logger.getLogger("info.qhdong.app");
    public static void main(String[] args) {

        Logger.getGlobal().setLevel(Level.OFF);

        Logger.getGlobal().info("File->Open menu item selected");

        Logger.getGlobal().info("File->Open menu item selected");
    }
}
