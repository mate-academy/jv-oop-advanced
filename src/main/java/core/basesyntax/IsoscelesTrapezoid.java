package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float sideA;
    private float sideB;
    private float high;
    private double area;

    public IsoscelesTrapezoid(Color color, float sideA, float sideB, float high) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
        area = sideA + sideB * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + area
                + " sq.units, sideA: " + sideA + " units, sideB: " + sideB + " units, high: "
                + high + " color: " + getColor());
    }
}
