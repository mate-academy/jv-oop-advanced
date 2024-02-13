package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getPrint() {
        return "Figure: rectangle, area: " + calculateArea() + "sq. units, "
                + " width: " + width + " units, "
                + " height: " + height + " units, " + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
