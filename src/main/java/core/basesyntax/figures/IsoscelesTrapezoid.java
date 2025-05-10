package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topSide;
    private int bottomSide;

    public IsoscelesTrapezoid(int height, int topSide, int bottomSide, String color) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sc.units,"
                + " top side: " + topSide + " units, bottom side: " + bottomSide + " units,"
                + " height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2) * height;
    }
}
