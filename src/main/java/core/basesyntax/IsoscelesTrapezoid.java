package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(int baseSide, int topSide, int height, String color) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * baseSide * topSide * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + ", baseSide: " + baseSide + ", topSide: " + topSide
                + ",height: " + height + ", color: " + getColor() + ".");
    }
}
