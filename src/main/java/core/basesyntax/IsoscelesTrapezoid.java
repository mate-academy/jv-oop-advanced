package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int downSide, int height) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    public int getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public int getDownSide() {
        return downSide;
    }

    public void setDownSide(int downSide) {
        this.downSide = downSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top side: " + topSide
                + " units, down side: " + downSide
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
