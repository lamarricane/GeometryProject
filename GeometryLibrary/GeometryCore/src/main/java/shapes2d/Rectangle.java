package shapes;

public class Rectangle {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        return (height + width) * 2;
    }

    public double calculateArea() {
        return height * width;
    }
}
