package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int height;
    private String name = "isoscelesTrapezoid";

    public IsoscelesTrapezoid() {
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public int getTopBase() {
        return topBase;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) / 2) * getHeight();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                +
                ", area: " + getArea() + " sq.units"
                +
                ", bottomBase: " + getBottomBase() + " units"
                +
                ", topBase : " + getTopBase() + " units"
                +
                ", height : " + getHeight() + " units"
                +
                ", color: " + super.getColor());
    }
}
