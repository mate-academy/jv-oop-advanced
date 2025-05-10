package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int basisA;
    private int basisB;
    private int height;

    public IsoscelesTrapezoid(String color, int basisA, int basisB, int height) {
        super(color);
        this.basisA = basisA;
        this.basisB = basisB;
        this.height = height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return ((basisA + basisB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + getArea() + " sq.units, basisA: "
                + basisA + " units, basisB: "
                + basisB + " units, height: "
                + height + " units, color: "
                + getColor());
    }
}
