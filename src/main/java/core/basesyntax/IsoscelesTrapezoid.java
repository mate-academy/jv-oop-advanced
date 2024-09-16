package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideH;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int sideH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public double getArea() {
        return (double) ((sideA + sideB) * sideH) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA + ", sideB: " + sideB
                + ", sideH: " + sideH + " units, color: " + getColor());
    }
}
