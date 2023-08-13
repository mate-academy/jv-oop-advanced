package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, FigurePainter {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return this.firstSide * secondSide;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.1f", getArea())
                + " sq.units, first side: "
                + firstSide
                + " units, second side: "
                + secondSide
                + " units, color: "
                + getColor());
    }
}
