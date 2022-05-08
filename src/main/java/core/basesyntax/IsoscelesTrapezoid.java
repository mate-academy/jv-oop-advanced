package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upperSide;
    private int lowerSide;

    public IsoscelesTrapezoid(String color, int height, int upperSide, int lowerSide) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                            + " sq.units, upperSide: " + upperSide
                            + " units, lowerSide: " + lowerSide + " units, height: "
                            + height + " units, color: " + getColor());
    }
}
