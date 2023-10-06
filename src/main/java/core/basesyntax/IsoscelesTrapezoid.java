package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    static final FigType type = FigType.IsoscelesTrapezoid;
    private float sideA;
    private float sideB;
    private float high;

    public IsoscelesTrapezoid(Color color, float sideA, float sideB, float high) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double getArea() {
        return sideA + sideB * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, high: " + high
                + " color: " + getColor());
    }
}
