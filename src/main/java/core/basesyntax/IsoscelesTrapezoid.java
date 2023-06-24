package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTrapezoid(Color color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 4 * Math.sqrt(4 * sideC * sideC - Math.pow(sideA - sideB, 2));
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA + " units, sideB: "
                + sideB + " units, sideC: " + " units, color: " + color);
    }
}
