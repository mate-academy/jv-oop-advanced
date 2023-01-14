package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int basis1;
    private int basis2;

    public IsoscelesTrapezoid(Color color, int height, int basis1, int basis2) {
        super(color);
        this.height = getRandom().nextInt(Max_Value);
        this.basis1 = getRandom().nextInt(Max_Value);
        this.basis2 = getRandom().nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid {" +
                "height: " + height + " units" +
                ", basis1: " + basis1 + " units" +
                ", basis2: " + basis2 + " units" +
                ", color: " + color +
                ", area: " + getArea() + " sq.units" +
                '}';
    }

    @Override
    public double getArea() {
        return (basis1 + basis2) / 2 * height;
    }
}
