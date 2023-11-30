package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + "sq.units, width: "
                + width + " units, height: " + height
                + "units, color: " + color);
    }
}
