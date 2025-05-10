package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int DIVIDER = 2;
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (firstSide + secondSide) / DIVIDER * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first parallel side: " + firstSide + " units, second parallel side: "
                + secondSide + " units, color: " + getColor());
    }
}
