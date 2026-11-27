import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();

        double si = (p * t * r) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
} 
    

