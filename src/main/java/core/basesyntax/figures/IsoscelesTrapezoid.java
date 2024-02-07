package core.basesyntax.figures;

public class IsoscelesTrapezoid extends GeometricFigure {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * Math.sqrt(sideC * sideC - Math.pow(sideA - sideB, 2) / 4);
    }

    @Override
    public void draw() {
        System.out.println("GeometricFigure: isosceles trapezoid, area: " + getArea()
                + " sq.units, side a: " + sideA + " units, side b: " + sideB
                + " units, side c: " + sideC + " units, color: " + getColor());
    }
}
