package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, color: "
                + getColor().toString().toLowerCase()
                + ", area: " + Math.round(getArea())
                + " sq. units, upperSide: " + upperSide
                + " units, lowerSide: " + lowerSide
                + " units, height: " + height + " units");
    }
}
