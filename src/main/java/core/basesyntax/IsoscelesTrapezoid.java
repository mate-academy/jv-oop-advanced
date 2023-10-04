package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private String color;
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        this.color = color;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure isoscel,area:" + getArea() + "sq.units,upper base:"
                + upperBase + "units,lowerbase:" + lowerBase + "units,height:" + height + "units,color:" + color);
    }
}
