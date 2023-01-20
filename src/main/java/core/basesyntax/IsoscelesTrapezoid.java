package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int basis1;
    private int basis2;

    public IsoscelesTrapezoid(Color color, int height, int basis1, int basis2) {
        super(color);
        this.height = height;
        this.basis1 = basis1;
        this.basis2 = basis2;
    }

    @Override
    public double getArea() {
        return (basis1 + basis2) / 2 * height;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: IsoscelesTrapezoid {" + "height: " + height + " units"
                + ", basis1: " + basis1 + " units" + ", basis2: " + basis2 + " units"
                + ", color: " + getColor() + ", area: " + getArea() + " sq.units" + '}');
    }
}
