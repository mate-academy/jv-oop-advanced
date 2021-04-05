package core.basesyntax;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2, Color color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: rectangle, area %f sq. units, %s, color %s\n",
                calculateArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("side1 length: %f units, side2 length: %f units",
                side1, side2);
    }
}
