public class Divop {
    public static void main(String[] args) {
        int a = 15, b = 0;
        try {
            int div =a/b;
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    
}
