package core.basesyntax.shapes;

public class IsoscelesTrapezoid extends Shape {
    private double lowerBase;
    private double upperBase;
    private double height;

    public IsoscelesTrapezoid(String name, String color,
                              double lowerBase, double upperBase, double height) {
        super(name, color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * height / 2;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "lower base: " + getLowerBase() + " units, "
                + "upper base: " + getUpperBase() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + this.getColor());
    }
}
