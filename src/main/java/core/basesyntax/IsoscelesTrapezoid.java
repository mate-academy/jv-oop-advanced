package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(double upSide, double downSide, double height, String color) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, upSide: " + upSide + " units, downSide: "
                + downSide + " units, height: " + height + "units, color: " + getColor());
    }
}
