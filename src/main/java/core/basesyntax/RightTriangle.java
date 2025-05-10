package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public RightTriangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2f;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea()
                + " sq.units, firstSide: "
                + firstSide
                + " units, secondSide: "
                + secondSide
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
