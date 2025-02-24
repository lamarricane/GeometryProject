package shapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double calculateCircumference() {
        return 2 * PI * r;
    }

    public double calculateArea() {
        return PI * pow(r, 2);
    }
}
