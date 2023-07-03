package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figures {
    private static final int MATH_CONSTANT = 2;
    private int bottomBase;
    private int topBase;
    private int height;

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
        return (double)(bottomBase + topBase) / MATH_CONSTANT * height;
    }

    @Override
    public void draw() {

        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                           + " sq.units, bottom base: " + bottomBase
                           + " " + unitOrUnits(bottomBase) + ", top base: " + topBase
                           + " " + unitOrUnits(topBase) + ", height: " + height
                           + " " + unitOrUnits(height) + ", color: " + getColor().getInfo());
    }
}
