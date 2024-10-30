package Dictionary;

import java.util.logging.Logger;
import java.util.logging.*;

public class LogFileExam {
    private static final Logger logger = Logger.getLogger("MyLogg");
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("LoggFile.log",true);
            logger.addHandler(fh);
            SimpleFormatter sh = new SimpleFormatter();
            fh.setFormatter(sh);

            logger.info("This is the logging message");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
