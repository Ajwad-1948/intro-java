public class BeginnerConcepts {
    public static void main(String[] args) {
        
        // 1. Casting and Data Conversion - Explicit Casting
        double price = 19.99;
        int intPrice = (int) price; // Explicit casting from double to int
        System.out.println("Original price (double): " + price);
        System.out.println("Converted price (int): " + intPrice);

        // 2. Increment and Decrement Operators - Using increment (++)
        int counter = 5;
        counter++; // incrementing the value by 1
        System.out.println("Counter after increment: " + counter);

        //  3. Quick Check / Short Circuit Evaluation - Using &&
        int x = 10;
        int y = 5;
        // y is not checked because x > 20 is false
        if (x > 20 && ++y > 5) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("Short circuit happened. y was not incremented.");
        }
        System.out.println("y after short-circuit check: " + y);

        // 4. Type Promotion - small types promoted to larger types
        byte a = 10;
        byte b = 20;
        // a + b promotes both to int, result is int
        int result = a + b;
        System.out.println("Result after type promotion (byte + byte -> int): " + result);
    }
}
