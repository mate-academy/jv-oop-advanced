package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowBase;
    private int topBase;
    private int height;

    public IsoscelesTrapezoid(int lowBase, int topBase, int height, Color color) {
        super(color);
        this.lowBase = lowBase;
        this.topBase = topBase;
        this.height = height;
    }

    public int getLowBase() {
        return lowBase;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    public double getArea() {
        return (lowBase + topBase) / 2 * height;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, lowBase: "
                + getLowBase() + " units, topBase : " + getTopBase() + " units, hight: "
                + getHeight() + " units, color: " + getColor());
    }
}
