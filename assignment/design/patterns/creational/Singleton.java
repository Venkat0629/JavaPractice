package assignment.design.patterns.creational;

/* Singleton Pattern:
Ensures a class has only one instance and provides a global point of access to it.
*/
class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

class Singleton {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Singleton Pattern example");
    }
}
/*
Example: Logger class in a logging system. Ensures only one instance of Logger exists to control access to shared resources like log files.

 */