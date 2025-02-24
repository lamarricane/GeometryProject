package comparator;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;

public class GeometryComparison {

    public boolean equal(Circle circle1, Circle circle2) {
        return circle1.getR() == circle2.getR();
    }

    public boolean equal(Triangle triangle1, Triangle triangle2) {
        return triangle1.calculatePerimeter() == triangle2.calculatePerimeter();
    }

    public boolean equal(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculatePerimeter() == rectangle2.calculatePerimeter();
    }
}