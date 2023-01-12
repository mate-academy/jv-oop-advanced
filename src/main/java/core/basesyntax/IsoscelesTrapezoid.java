package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int basis1;
    private int basis2;

    public IsoscelesTrapezoid(Color color, int height, int basis1, int basis2) {
        super(color);
        this.height = random.nextInt(Max_Value);
        this.basis1 = random.nextInt(Max_Value);
        this.basis2 = random.nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "height=" + height +
                ", basis1=" + basis1 +
                ", basis2=" + basis2 +
                ", color=" + color +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return (basis1 + basis2) / 2 * height;
    }
}
