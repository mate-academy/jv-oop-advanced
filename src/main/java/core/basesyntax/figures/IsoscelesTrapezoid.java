package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    protected double topSide;
    protected double bottomSide;
    protected double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isoscelesTrapezoid, area: %.2f, topSide: %.2f,"
                + " bottomSide: %.2f, height: %.2f, color: %s%n",
                getArea(), topSide, bottomSide, height, color);
    }
}
