import java.util.Scanner;

class MortgageCalculator {
 
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = 0;
        double P = 0;
        double r = 0;
        double n = 0;
        
        System.out.println("Investment Calculator");
        System.out.println("-------------------");
        System.out.print("Enter the investments's principal amount in dollars: $");
        P = sc.nextDouble();
        System.out.print("Enter the investment's interest rate: ");
        r = sc.nextDouble();
        System.out.print("Enter the number of years the investment will accumulate wealth: ");
        n = sc.nextDouble();
        System.out.println("");
        
        A = P * Math.pow(1 + r, n);
        System.out.println("This investment will be worth $" + A + " after " + n + " years.");
    }
    
}