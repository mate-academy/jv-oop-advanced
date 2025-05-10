package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int downSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(int downSide, int topSide, int height, String color) {
        this.downSide = downSide;
        this.topSide = topSide;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return ((downSide + topSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "downSide: " + getDownSide() + " units, "
                + "topSide: " + getTopSide() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + getColor());
    }

    public int getDownSide() {
        return downSide;
    }

    public int getHeight() {
        return height;
    }

    public int getTopSide() {
        return topSide;
    }
}
