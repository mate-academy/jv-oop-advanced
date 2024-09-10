package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideH;

    IsoscelesTrapezoid(String color, int sideA, int sideB, int sideH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public void returnInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + (sideA + sideB) * sideH / 2
                + " sq.units, sideA: " + sideA + ", sideB: " + sideB
                + ", sideH: " + sideH + " units, color: " + getColor());
    }
}
