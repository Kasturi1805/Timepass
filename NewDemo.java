import java.util.Scanner;

public class NewDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner("System.in");

        System.out.println("Enter radius");
        double r = sc.nextDouble();

        sc.close();

        double area = 3.14*r*r;

        System.out.println("Area  of Circlr :" +area);
    }
    
    
}
