public class RectangleTest {
    public static void main(String[] args) throws Exception {
        Rectangle rect1 = new Rectangle(4, 40);
        System.out.println("Rectangle 1 has a width of " + rect1.width + 
        ", a height of " + rect1.height + ", an area of " + rect1.getArea() +
        ", and a perimeter of " + rect1.getPerimeter());
        System.out.println();

        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.println("Rectangle 2 has a width of " + rect2.width + 
        ", a height of " + rect2.height + ", an area of " + rect2.getArea() +
        ", and a perimeter of " + rect2.getPerimeter());
        
    }
}

class Rectangle {
    double width;
    double height;
    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width * 2) + (height * 2);
    }
}