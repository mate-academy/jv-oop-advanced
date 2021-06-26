package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        return ((getSideA() * getSideB() / 2) * Math.sqrt(getSideC() * getSideC()
                - (getSideB() - getSideA()) * (getSideB() - getSideA())));
    }

    @Override
    public String draw() {
        System.out.println(("Figure: Square, area: " + getArea()
                + " sq.units, size side A: " + getSideA()
                + " sq.units, size side B: " + getSideB()
                + " sq.units, size side C: " + getSideC()
                + " units, color: " + getColor()));
        return null;
    }
}
