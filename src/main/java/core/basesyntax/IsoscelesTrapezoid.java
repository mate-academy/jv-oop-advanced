package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: IsoscelesTrapezoid, area: " + getArea()
                + " topBase: " + topBase
                + " bottomBase: " + bottomBase
                + " height: " + height
                + " color: " + getColor());

    }
}
