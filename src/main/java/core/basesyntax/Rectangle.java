package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {
        super("rectangle");
        this.width = FigureSupplier.getRandomProperties();
        this.height = FigureSupplier.getRandomProperties();
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
            + ", area: " + getArea()
            + ", perimeter: " + getPerimeter()
            + ", color: " + getColor();

    }
}
