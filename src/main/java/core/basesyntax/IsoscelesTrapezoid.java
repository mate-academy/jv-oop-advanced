package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upBasis;
    private int downBasis;
    private int height;
    private final String name = "IsoscelesTrapezoid";

    public IsoscelesTrapezoid(int upBasis, int downBasis, int height, Color color) {
        super(color);
        this.upBasis = upBasis;
        this.downBasis = downBasis;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upBasis + downBasis) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, UpBasis: "
                + upBasis + ", DownBasis: " + downBasis
                + ", Height: " + height + ", color: " + getColor());
    }
}
