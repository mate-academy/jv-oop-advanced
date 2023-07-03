package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figures {
    private int bottomBase;
    private int topBase;
    private int height;

    public IsoscelesTrapezoid(int bottomBase, int topBase, int height, String color) {
        setColor(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    public IsoscelesTrapezoid() {

    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double)(bottomBase + topBase) / 2 * height;
    }

    @Override
    public void draw() {

        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                           + " sq.units, bottom base: " + bottomBase
                           + " " + unitOrUnits(bottomBase) + ", top base: " + topBase
                           + " " + unitOrUnits(topBase) + ", height: " + height
                           + " " + unitOrUnits(height) + ", color: " + getColor());
    }
}
