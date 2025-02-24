package shapes3d;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere {
    private final double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * PI * pow(r, 3);
    }

    public double calculateSurfaceArea() {
        return 4 * PI * pow(r, 2);
    }
}
