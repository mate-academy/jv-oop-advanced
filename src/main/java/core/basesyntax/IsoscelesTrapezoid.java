package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea(){
        return (topBase + bottomBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq. units, topBase: " + topBase + " units, bottomBase: " + bottomBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
