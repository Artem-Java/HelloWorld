public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double discriminant() {
        double discriminant = (Math.pow(b, 2) - 4*a*c);
        System.out.println("Дискриминант квадратного уравнения равен = " + discriminant);
        return discriminant;
    }
    public void Root(double discriminant) {
        if (discriminant < 0) {
            System.out.println("Корней нет!");
        } else if (discriminant == 0) {
            double root = (-b) / (2 * a);
            System.out.println("Один корень: " + root);
        } else {
            double root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
            double root2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два корня: " + root1 + " и " + root2);
        }
    }

}
