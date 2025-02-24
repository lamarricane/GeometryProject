package shapes3d;

import static java.lang.Math.pow;

public class Cube {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculateVolume() {
        return pow(side, 3);
    }

    public double calculateSurfaceArea() {
        return 6 * pow(side, 2);
    }
}