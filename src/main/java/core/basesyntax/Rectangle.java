package core.basesyntax;

public class Rectangle extends Figure {
    double width;
    double length;

    public Rectangle(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }
    @Override
    double getArea() {
        return width * length;
    }

    @Override
    void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() +
                " sq. units, width: " + width +
                " units, length: " + length +
                " units, color: " + color);
    }
}
