package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double bottomBase;
    private final double topBase;

    public IsoscelesTrapezoid(String color, double height, double bottomBase, double topBase) {
        super(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    public double getHeight() {
        return height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + "sq. units, color: " + getColor()
                + ", height: " + getHeight() + ", bottomBase: " + getBottomBase()
                + ", topBase: " + getTopBase());

    }
}
