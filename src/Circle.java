public class Circle {

    // Create and set variables
    private double radius = 1.0f;
    private String colour = "red";

    // Empty constructor
    public Circle() {
    }

    // Given radius constructor
    public Circle(double r) {
        this.radius = r;
    }

    // Radius getter
    public double getRadius() {
        return radius;
    }

    // Calculate and give circle area
    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }
}
