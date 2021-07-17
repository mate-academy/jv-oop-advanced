package core.basesyntax.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger extends Logger {
    protected MyLogger(String name, String resourceBundleName) {
        super(name, resourceBundleName);
    }

    public static Logger getLogger(String name) {
        Logger logger = Logger.getLogger(name);

        // disable by default, change it for enabling
        logger.setLevel(Level.ALL);

        return logger;
    }
}
