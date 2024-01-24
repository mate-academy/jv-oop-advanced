package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, "
                + "lower base: " + getLowerBase() + " units, "
                + "upper base: " + getUpperBase() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + getColor());
    }

    public int getUpperBase() {
        return upperBase;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public int getHeight() {
        return height;
    }
}
