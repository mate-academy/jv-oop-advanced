package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTrapezoid(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * Math.sqrt(Math.pow(sideC, 2)
                - ((Math.pow((sideA - sideB), 2)) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureTypes.IsoscelesTrapezoid + ", area: "
                + getArea() + " sq.units, " + "side1: " + sideA + " units, "
                + "side2: " + sideB + " units, " + "side3: " + sideC
                + " units, " + "color: " + getColor());
    }
}
