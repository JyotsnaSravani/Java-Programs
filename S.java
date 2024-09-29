abstract class Shape {
    int dim1,dim2;
    abstract void printArea();
}
class Rectangle extends Shape {
    int length, width;
    Rectangle(int length, int width) {
        this.dim1 = length;
        this.dim2 = width;
    }
    void printArea() {
        System.out.println("Area of Rectangle: " + (dim1*dim2));
    }
}
class Triangle extends Shape {
    int base, height;
    Triangle(int base, int height) {
        this.dim1 = base;
        this.dim2 = height;
    }
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}
class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.dim1 = radius;
    }
    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI *dim1 * dim1));
    }
}
public class S {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5,3),
            new Triangle(2,6),
            new Circle(3)
        };
        for (Shape shape : shapes) {
            shape.printArea();
        }
    }
}