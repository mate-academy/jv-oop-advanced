package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.ISOSCELESTRAPEZOID);
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2 * height;
    }

    @Override
    public void buildFigure() {
        System.out.println("Figure: " + name() + ", area: " + getArea() + " sq.units, topBase: "
                + topBase + ", bottomBase: " + bottomBase + ", height: "
                + height + " units, color: " + getColor());

    }
}
