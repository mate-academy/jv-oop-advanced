package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Rectangle() {

    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: " + Figures.RECTANGLE.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "width: " + width + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor();
    }
}
