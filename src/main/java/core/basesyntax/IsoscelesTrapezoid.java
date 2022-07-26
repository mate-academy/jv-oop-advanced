package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private ColorSupplier cs = new ColorSupplier();
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double firstBase, double secondBase, double height) {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid , area: "
                + getArea(firstBase, secondBase, height)
                + ", firstBase: " + firstBase + ", secondBase: "
                + secondBase + ", height: " + height
                + ", color: " + getColor());
    }
}
