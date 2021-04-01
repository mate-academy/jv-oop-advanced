package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int lowBase;
    private int height;

    public IsoscelesTrapezoid(String color, String name, int topBase, int lowBase, int height) {
        super(color, "Isosceles Trapezoid");
        this.height = height;
        this.topBase = topBase;
        this.lowBase = lowBase;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getLowBase() {
        return lowBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (topBase + lowBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, low base length: "
                + getLowBase() + " units, top base length: "
                + getTopBase() + " units, height length: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
