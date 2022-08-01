package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public int getSideA() {
        return topSide;
    }

    public int getSideB() {
        return bottomSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (topSide * bottomSide / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide + ", sideB: " + ", bottomSide: "
                + bottomSide + ", height: " + height + ", color: " + getColor());
    }
}
