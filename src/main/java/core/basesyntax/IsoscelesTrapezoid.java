package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = 0.5 * (upperBase + lowerBase) * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid; color : " + getColor() + "; upper base: "
                + upperBase + "; lower base: " + lowerBase + "; height: " + height + "; area: "
                + getArea() + ";");
    }
}
