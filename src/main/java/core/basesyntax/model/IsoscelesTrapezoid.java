package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double bottomBase;
    private final double topBase;

    public IsoscelesTrapezoid(String color, double bottomBase, double topBase, double height) {
        super(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    @Override
    public double getArea() {
        return height * ((bottomBase + topBase) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + "sq. units, height: " + height + ", bottomBase: "
                + bottomBase + ", topBase: " + topBase + ", color: " + getColor());

    }
}
