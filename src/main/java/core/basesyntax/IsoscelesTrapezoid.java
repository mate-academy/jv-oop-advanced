package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperTrapezoid;
    private int lowerTrapezoid;
    private int height;

    public IsoscelesTrapezoid(String color, int upperTrapezoid, int lowerTrapezoid, int height) {
        super(color);
        this.upperTrapezoid = upperTrapezoid;
        this.lowerTrapezoid = lowerTrapezoid;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperTrapezoid + lowerTrapezoid) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units"
                + ", upperTradezoid: " + upperTrapezoid + " units"
                + ", lowerTradezoid: " + lowerTrapezoid + " units"
                + ", height: " + height + " units"
                + ", color: " + getColor());
    }
}
