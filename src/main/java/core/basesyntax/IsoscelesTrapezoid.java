package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int mirrorSide;
    private int sideA;
    private int sideB;

    public IsoscelesTrapezoid(Color color, int mirrorSide, int sideA, int sideB) {
        super(color);
        this.mirrorSide = mirrorSide;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return mirrorSide * 0.5 * sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType() + ", area: "
                + area() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, mirrorSide: "
                + mirrorSide + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
