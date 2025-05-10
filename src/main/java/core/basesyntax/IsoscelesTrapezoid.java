package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    protected final int bottomBase;
    protected final int topBase;
    protected final int height;

    public IsoscelesTrapezoid(Color color, final int bottomBase, final int topBase,
                              final int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    //constructor for rectangle case
    public IsoscelesTrapezoid(Color color, final int base, final int height) {
        this(color, base, base, height);
    }

    @Override
    public double getArea() {
        return (bottomBase + topBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "isosceles trapezoid,"
                + " area: "
                + getArea()
                + " sq.units,"
                + " bottom base: "
                + bottomBase
                + " units, "
                + " top base: "
                + topBase
                + " units, "
                + " height: "
                + height
                + " units, "
                + "color: "
                + getColor());

    }
}
