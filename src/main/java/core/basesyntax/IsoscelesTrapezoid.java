package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int weight;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int weight) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) * weight) / 2.00;
    }

    @Override
    public void drowFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, weight: "
                + weight + " units, color: " + getColor());
    }
}
