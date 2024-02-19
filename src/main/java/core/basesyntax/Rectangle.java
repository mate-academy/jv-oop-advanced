package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, "
                + "area: "
                + getArea()
                + " sq. units, "
                + "sides: "
                + "width: "
                + width
                + " height: "
                + height
                + " units, "
                + "color: "
                + getColor();
    }
}
