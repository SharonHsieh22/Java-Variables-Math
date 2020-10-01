import java.util.Scanner;

class DistFormula {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2;
        double dist = 0;
        
        System.out.println("Distance Calculator");
        System.out.println("-------------------");
        System.out.print("Enter the x coordinate of point 1: ");
        x1 = sc.nextDouble();
        System.out.print("Enter the y coordinate of point 1: ");
        y1 = sc.nextDouble();
        System.out.print("Enter the x coordinate of point 2: ");
        x2 = sc.nextDouble();
        System.out.print("Enter the y coordinate of point 2: ");
        y2 = sc.nextDouble();
        System.out.println("");
        
        dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between point 1 and point 2 is " + dist + " units.");
    }
}