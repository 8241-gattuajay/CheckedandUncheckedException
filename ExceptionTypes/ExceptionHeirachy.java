package ExceptionTypes;

class ApplicationException extends Exception {
    public ApplicationException(String message) {
        super(message);
    }
}
class DatabaseException extends ApplicationException {
    public DatabaseException(String message) {
        super(message);
    }
}
class NetworkException extends ApplicationException {
    public NetworkException(String message) {
        super(message);
    }
}
public class ExceptionHeirachy {
    public static void main(String[] args) {
        try {
            throw new DatabaseException("Database error");
        } catch (ApplicationException e) {
            System.out.println("Caught: " + e);
        }
    }
}

