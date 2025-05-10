package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(int baseA, int baseB, int height) {
        super();
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseA + baseB) / 2) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, base A "
                + baseA + " units, base B: " + baseB + " units, height: " + height
                + " units, color: " + color);
    }
}
