package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTrapezoid(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getA() {
        return (sideA + sideB) / 2 * sideC;
    }

    public void setA(double a) {
        this.sideA = sideA;
    }

    public double getB() {
        return sideB;
    }

    public void setB(double b) {
        this.sideB = sideB;
    }

    public double getC() {
        return sideC;
    }

    public void setC(double c) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * 2 * sideC;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid: square, area: "
                + getArea()
                + " sq.units, color: "
                + this.getColor();
    }
}
