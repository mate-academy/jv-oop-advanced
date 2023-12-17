package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int length;

    public Rectangle(String color, int height, int length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea()
                + " sq. units, height: "
                + " units, length: "
                + length
                + " units, height: "
                + height
                + " color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return height * length;
    }
}
