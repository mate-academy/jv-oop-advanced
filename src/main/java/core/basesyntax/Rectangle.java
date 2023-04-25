package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, width: "
                + width + " units, height: "
                + height + " units, color: "
                + getColor());
        return null;
    }
}
