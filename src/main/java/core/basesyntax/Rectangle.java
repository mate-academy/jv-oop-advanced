package core.basesyntax;

public class Rectangle extends Figure {
    private final int longSide;
    private final int shortSide;

    public Rectangle(String color, int longSide, int shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + "sq. units, longSide: " + longSide + ", shortSide: "
                + shortSide + ", color: " + getColor());
    }
}
