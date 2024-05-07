package core.basesyntax;

public class Rectangle extends Figure {
    double length;
    double width;

    public Rectangle (String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
    @Override
    void draw() {
        System.out.println("Rectangle color: " + color +
            ", Length = " + length + ", Width = " + width +
            "Area = " + getArea());
    }
}
