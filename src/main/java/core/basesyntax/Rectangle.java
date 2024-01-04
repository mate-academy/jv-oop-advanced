package core.basesyntax;

public abstract class Rectangle extends AbstractFigure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, " + "length: " + length + " units, width: "
                + width + " units, color: " + color);
    }

    public abstract Color getColor();
}
