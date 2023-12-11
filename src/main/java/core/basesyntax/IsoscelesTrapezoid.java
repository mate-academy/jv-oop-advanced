package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double leg;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double leg) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.leg = leg;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return (leg * leg) - (lowerBase * lowerBase - upperBase * upperBase) / 4;
    }

    @Override
    public void draw() {
        System.out.printf("Isosceles trapezoid:    area = %.2f sq. units, upper base = %.2f units,"
                        + " lower base = %.2f units, leg = %.2f units, color = %s%n",
                this.area, this.upperBase, this.lowerBase, this.leg, this.color);
    }
}
