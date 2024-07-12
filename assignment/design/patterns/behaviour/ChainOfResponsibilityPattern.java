package assignment.design.patterns.behaviour;

import java.io.*;

interface Logger {
    void logMessage(String message, LogLevel level);
}

class ConsoleLogger implements Logger {
    private LogLevel logLevel;

    public ConsoleLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level.equals(logLevel) || level.equals(LogLevel.ALL)) {
            System.out.println("Console Logger: " + message);
        }
    }
}

class FileLogger implements Logger {
    private LogLevel logLevel;
    private File logFile;

    public FileLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
        this.logFile = new File("application.log");
    }

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level.equals(logLevel) || level.equals(LogLevel.ALL)) {
            try {
                FileWriter writer = new FileWriter(logFile, true);
                writer.write("File Logger: " + message + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);
        Logger fileLogger = new FileLogger(LogLevel.ERROR);

        consoleLogger.logMessage("This is an information message.", LogLevel.INFO);
        consoleLogger.logMessage("This is a warning message.", LogLevel.WARNING);
        consoleLogger.logMessage("This is an error message.", LogLevel.ERROR);

        fileLogger.logMessage("This is an information message.", LogLevel.INFO);
        fileLogger.logMessage("This is a warning message.", LogLevel.WARNING);
        fileLogger.logMessage("This is an error message.", LogLevel.ERROR);
    }
}

enum LogLevel {
    INFO, WARNING, ERROR, ALL
}
