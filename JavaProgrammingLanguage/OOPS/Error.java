public class Error {
        public static void main(String[] args) {
            try {
                int x = 10 / 0; // ❌ Risky code
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            } finally {
                System.out.println("Cleanup done.");
            }
        }
    }    
