// Step 2: Remove duplication using inheritance
class Shape {
    String color;
    int borderWidth;

    Shape(String c, int bw) {
        color = c;
        borderWidth = bw;
    }

    void showDetails() {
        System.out.println(color + " " + borderWidth);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r, String c, int bw) {
        super(c, bw);
        radius = r;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }
}
