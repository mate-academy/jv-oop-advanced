package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println( "Figure1: rectangle, area: " + getArea() + "sq.units, width: " + width +
                "units, height: " + height + "units, color: " + getColor());
    }
}
