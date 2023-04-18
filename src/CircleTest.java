public class CircleTest {
    public static void main(String[] args) {

        // Use blank circle creation
        Circle c1 = new Circle();
        // Test output
        System.out.printf("This circle has a radius of %f and an area of %f %n",c1.getRadius(), c1.getArea());

        // Use given radius circle creation
        Circle c2 = new Circle(4);
        // Test output
        System.out.printf("This circle has a radius of %f and an area of %f %n",c2.getRadius(), c2.getArea());
    }
}
