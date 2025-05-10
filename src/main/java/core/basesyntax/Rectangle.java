package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        setColor(color);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " square units, length: " + length + " units, width: " + width
                + " units, color: " + getColor());
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
