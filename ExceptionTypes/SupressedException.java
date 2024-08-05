package ExceptionTypes;

public class SupressedException {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed);
            }
        }
    }
}
class Resource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Exception in close");
    }
    public void doSomething() throws Exception {
        throw new Exception("Exception in doSomething");
    }
}
