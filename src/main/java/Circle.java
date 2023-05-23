public class Circle {
    static double pi = 3.14;
    double radius;
    double square;
    double circumference;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square() {
        return pi * Math.pow(radius, 2);
    }
    public double circumference() {
        return 2 * radius * pi;
    }

}
