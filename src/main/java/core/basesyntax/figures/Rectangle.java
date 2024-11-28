package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateSquare() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + calculateSquare()
                + " sq. units, width: " + width
                + " sq. units, height: " + height
                + " units, color: "
                + color;
    }
}
