package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private int upperBase;
    private int lowerBase;
    private int height;
    private String color;
    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) ((upperBase + lowerBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + "sq. units, upperBase: "
                + upperBase + "units, lowerBase: " + lowerBase + "units, height: " + height + "units, color: " + color);
    }
}
