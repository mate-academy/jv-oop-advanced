package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int basisDown;
    private int basisUp;
    private int height;

    public IsoscelesTrapezoid(int basisDown, int basisUp, int height) {
        this.basisDown = basisDown;
        this.basisUp = basisUp;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * (basisDown - basisUp) + basisUp * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + getArea()
                + "sq.units, basisDown: "
                + basisDown
                + " basisUp: "
                + basisUp
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
