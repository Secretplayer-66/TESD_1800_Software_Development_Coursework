import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Triangle tri1 = new Triangle();
        System.out.println("What is the length of side1? (double): ");
        tri1.side1 = input.nextDouble();
        System.out.println("What is the length of side2? (double): ");
        tri1.side2 = input.nextDouble();
        System.out.println("What is the length of side3? (double): ");
        tri1.side3 = input.nextDouble();
        System.out.println("What is the color of the triangle?: ");
        tri1.SetColor(input.next());
        System.out.println("Is the triangle filled? (true or false): ");
        tri1.setFilled(input.nextBoolean());

        tri1.toString();
        System.out.println("The area of the triangle is: " + tri1.getArea());
        System.out.println("The perimeter of the triangle is: " + tri1.getPerimeter());
        System.out.println("The color of the triangle is: " + tri1.getColor());
        System.out.println("Is the triangle filled? " + tri1.isFilled());
        System.out.println(tri1.getDateCreated());
    }
    
}

