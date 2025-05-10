package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int height;

    public IsoscelesTrapezoid(String color, int bottomBase, int topBase, int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units, "
                + "bottomBase: " + bottomBase + " units, "
                + "topBase : " + topBase + " units, "
                + "height : " + height + " units, "
                + "color: " + super.getColor());
    }
}
