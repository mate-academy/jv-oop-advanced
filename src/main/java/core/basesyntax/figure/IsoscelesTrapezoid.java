package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int lowSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upSide, int lowSide, int height) {
        super(color);
        this.upSide = upSide;
        this.lowSide = lowSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (upSide + lowSide) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, "
                        + "area: %.2f sq.units, upSide: %d units, lowSide: %d units, "
                        + "height: %d units, color: %s%n",
                getArea(), upSide, lowSide, height, getColor().toLowerCase());
    }
}
