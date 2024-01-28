package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        this.color = color;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topSide + bottomSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, topSide: " + topSide + " units, bottomSide: "
                + bottomSide + " units, height: " + height
                + " units, color: " + color);
    }
}
