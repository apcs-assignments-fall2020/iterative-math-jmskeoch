import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = Math.round(Math.random() * 100 + 1);
        double m = (n + x/n) / 2;

        while(Math.abs(n - m) > 0.00001) {
            n = m;
            m = (n + x/n) / 2;
        }

        return n;
            
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double result = 1;
        if(x == 0) {
            return 1;
        }
        
        for(int i = x; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0.0;
        int i = 0;
        
        while(Math.abs(e - Math.E) > 0.00001) {
            e = e + 1/factorial(i);
            i++;
        }

        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number!: ");
        double input = scan.nextDouble();

        System.out.println("The square root of " + input + " = " + babylonian(input));
        System.out.println("E is roughly " + calculateE());


        scan.close();
    }
}
