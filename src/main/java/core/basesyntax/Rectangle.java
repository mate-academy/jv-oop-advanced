package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(String color, double height, double secondSide) {
        super(color);
        this.height = height;
        width = secondSide;

    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units,"
                + " height: " + height + " units,"
                + " width: " + width + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
