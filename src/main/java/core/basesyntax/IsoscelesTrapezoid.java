package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int base;
    private int upperSide;

    public IsoscelesTrapezoid(int height, int base, int upperSide, Color color) {
        super(color);
        this.height = height;
        this.base = base;
        this.upperSide = upperSide;
    }

    @Override
    public double getArea() {
        return ((base + upperSide) / 2) * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, Area: " + getArea() + " sq. units, Height: "
                + height + ", Base: " + base + ", UpperSide: " + upperSide
                + " units, Color: " + getColor());
    }
}
