

public class DivisionOperation {
    public static void main(String[] args){
        int a = 15;
        int b = 0;
        try {
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
    
}
