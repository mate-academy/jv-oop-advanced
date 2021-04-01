import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

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
        return "Shape: " + getName() + ", area: " + getArea() + " sq. units"
                + ", width: " + width + " units, height: "
                + height + " units, color: " + getColor();
    }
}
