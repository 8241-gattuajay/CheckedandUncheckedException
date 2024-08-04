public class RethrowingException {
    public void performDivision(int numerator, int denominator) throws ArithmeticException {
        try {
            int result = numerator / denominator;
            System.out.println("Result of division : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error dividing by zero");
        }
    }

    public void calculate(int numerator, int denominator) {
        try {
            performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error dividing by zero in calculate method");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RethrowingException re = new RethrowingException();
        try {
            re.calculate(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error dividing by zero in main method"+ e.getMessage());
        }

    }
}
