package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + findArea()
                + " sq.units, first side: " + this.firstSide
                + " units, second side: " + this.secondSide
                + " units, color: " + getColor());
    }

    @Override
    public double findArea() {
        return firstSide * secondSide;
    }
}
