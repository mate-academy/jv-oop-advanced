package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String info() {
        return "Figure: rectangle, area: " + area() + " sq.units, width: "
                + width + " units, length: " + length + " units, color: "
                + getColor().name().toLowerCase();
    }
}
