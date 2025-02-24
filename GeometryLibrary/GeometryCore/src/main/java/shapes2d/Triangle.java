package shapes;

import static java.lang.Math.sqrt;

public class Triangle {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) throws IncorrectTriangleAspectRatio {
        if (firstSide + secondSide > thirdSide & secondSide + thirdSide > firstSide & thirdSide + firstSide > secondSide) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        } else throw new IncorrectTriangleAspectRatio("Incorrect triangle aspect ration!");
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public double calculateArea() {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }
}
