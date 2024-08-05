package ExceptionTypes;

public class ExceptionPropogation {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }
    }
    public static void method1() throws Exception {
        method2();
    }
    public static void method2() throws Exception {
        method3();
    }
    public static void method3() throws Exception {
        throw new Exception("Exception in method3");
    }
}
