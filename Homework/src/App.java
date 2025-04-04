import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);



        System.out.println("Please enter the diameter of the circle");
        int diameter = s.nextInt();

        System.out.println("------------------------------------------------------");

        System.out.println("please enter the length of the rectangle");
        int length = s.nextInt();
        System.out.println("please enter the breadth of the rectangle");
        int breadth = s.nextInt();

        System.out.println("------------------------------------------------------");

        System.out.println("Please enter side A of the triangle");
        int a = s.nextInt();
        System.out.println("Please enter side B of the triangle");
        int b = s.nextInt();
        System.out.println("Please enter side C of the triangle");
        int c = s.nextInt();

        System.out.println("------------------------------------------------------");


        int radius = diameter/2;
        System.out.println("The radius is: " + radius + "cm");

        System.out.println("------------------------------------------------------");

        int area = length*breadth;
        System.out.println("The area of the rectangle: " + area + "cm");

        System.out.println("------------------------------------------------------");

        int triangleA = (1/2)*b*c;
        System.out.println("The area of the triangle: " + triangleA + "cm");


    }

    
}
