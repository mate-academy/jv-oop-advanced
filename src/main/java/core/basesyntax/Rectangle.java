package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super("Rectangle", color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, Side A: %.0f units,"
                        + " Side B: %.0f units, color: %s",
                getType(),area(),sideA,sideB,getColor());
    }

    @Override
    public double area() {
        return sideB * sideB;
    }
}
