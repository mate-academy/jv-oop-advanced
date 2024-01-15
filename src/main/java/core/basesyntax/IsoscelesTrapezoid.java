package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) * 0.5 * height;
    }

    @Override
    public void draw() {
        System.out.format("Figure: isosceles trapezoid, color = %s, area = %.2f, (topSide = %.2f,"
                + " bottomSide = %.2f, height = %.2f\n",
                getColor(), getArea(), topSide, bottomSide, height);
    }
}
