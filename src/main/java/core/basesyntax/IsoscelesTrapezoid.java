package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                            + " sq.units, topSide: " + topSide + " units, bottomSide: "
                            + bottomSide + " units, height: " + height
                            + " units, color: " + color);
    }
}
