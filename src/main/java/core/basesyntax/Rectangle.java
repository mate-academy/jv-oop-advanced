package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "rectangle" + ", area: " + calculateArea()
                + ", length: " + length + ", width: " + width + ", color: " + getColor());
    }
}
