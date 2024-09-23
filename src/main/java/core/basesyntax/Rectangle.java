package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double height;

    public Rectangle(String color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    public double calculateArea() {
        return length * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq. units, length: " + length + " units, height: "
                + height + " units, color: " + getColor());
    }
}
