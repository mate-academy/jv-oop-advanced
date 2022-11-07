package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String name = "trapezoid";
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + name
                + ", area: " + df.format(getArea()) + " sq.units"
                + ", side A: " + this.sideA
                + ", side B: " + this.sideB
                + ", height: " + this.height
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return ((this.sideA + this.sideB) / 2) * this.height;
    }
}
