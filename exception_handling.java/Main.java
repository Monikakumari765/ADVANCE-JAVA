
class Shape {
    private String color;
    private int borderwidth;

    Shape(String c, int bw) {
        color = c;
        borderwidth = bw;
    }

    public String getColor() {
        return color;
    }

    public int getBw() {
        return borderwidth;
    }

    double area() {
        return 0;
    }

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    private int radius;

    Circle(int radius, String c, int bw) {
        super(c, bw);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    int l;
    int w;

    Rectangle(int l, int w, String c, int bw) {
        super(c, bw);
        this.l = l;
        this.w = w;
    }

    @Override
    double area() {
        return l * w;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(5, "Red", 2);

        System.out.println("Color: " + c.getColor());
        System.out.println("Border Width: " + c.getBw());
        System.out.println("Area: " + c.area());
        c.draw();

        System.out.println();

        Rectangle r = new Rectangle(10, 5, "Blue", 3);

        System.out.println("Color: " + r.getColor());
        System.out.println("Border Width: " + r.getBw());
        System.out.println("Area: " + r.area());
        r.draw();
    }
}