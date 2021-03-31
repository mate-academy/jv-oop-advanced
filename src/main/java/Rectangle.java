import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color, "rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Shape: " + getFigure() + ", area: " + getArea() + " sq. units"
                + ", width: " + width + " units, height: " + height + "units , height: "
                + height + " units, color: " + getColor();
    }
}
