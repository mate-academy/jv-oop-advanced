package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double trapezoidHeight;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double trapezoidHeight) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.trapezoidHeight = trapezoidHeight;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(double trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        double area = (getSideA() + getSideB()) / 2 * getTrapezoidHeight();
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: ISOSCELES_TRAPEZOID, area: " + String.format("%.2f", getArea())
                + " sq.units, trapezoid height: " + getTrapezoidHeight() + " ,sideA: " + getSideA()
                + " units, sideB: " + getSideB() + " units, color: " + getColor());
    }
}
