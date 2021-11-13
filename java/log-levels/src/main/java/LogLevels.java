public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
        // throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
    }

    public static String logLevel(String logLine) {
        int begIdx = logLine.indexOf("[");
        int endIdx = logLine.indexOf("]");

        return logLine.substring(begIdx+1, endIdx).toLowerCase();
        // throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {

        return message(logLine) + " (" + logLevel(logLine) + ")";
        // throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
