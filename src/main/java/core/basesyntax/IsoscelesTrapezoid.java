package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int firstSide;
    private final int secondSide;

    public IsoscelesTrapezoid(Color color, int height, int firstSide, int secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return ((double) (firstSide + secondSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", getArea())
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor().name().toLowerCase());
    }
}
