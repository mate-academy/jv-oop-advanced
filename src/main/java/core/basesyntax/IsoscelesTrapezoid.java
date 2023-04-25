package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
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

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq.units, upper base: "
                + upperBase
                + " units, lower base: "
                + lowerBase
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
