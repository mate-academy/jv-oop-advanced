package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int height;

    public IsoscelesTrapezoid(String color, String name, int lowerBase, int upperBase, int height) {
        super(color, name);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (0.5 * lowerBase * upperBase) * height;
    }

    @Override
    public void getFigureInfo() {
        System.out.println("Figure: " + getName() + ", area: " + area() + " sq. units, Lower base: "
                + getLowerBase() + ", Upper base: " + getUpperBase() + ", Height: " + getHeight()
                + ", color: " + getColor());
    }
}
