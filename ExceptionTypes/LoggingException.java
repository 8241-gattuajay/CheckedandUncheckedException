package ExceptionTypes;

import java.util.logging.Level;
import java.util.logging.Logger;
public class LoggingException {
    private static final Logger LOGGER =
            Logger.getLogger(LoggingException.class.getName());

    public static void main(String[] args) {
        try {
            throw new Exception("Sample exception");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception occurred",
                    e);
        }
    }
}

