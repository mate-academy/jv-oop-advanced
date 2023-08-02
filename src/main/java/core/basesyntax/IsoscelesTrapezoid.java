package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseLength1;
    private double baseLength2;
    private double height;

    public IsoscelesTrapezoid(String color, double baseLength1, double baseLength2, double height) {
        super(color);
        this.baseLength1 = baseLength1;
        this.baseLength2 = baseLength2;
        this.height = height;
    }

    public double getBaseLength1() {
        return baseLength1;
    }

    public void setBaseLength1(double baseLength1) {
        this.baseLength1 = baseLength1;
    }

    public double getBaseLength2() {
        return baseLength2;
    }

    public void setBaseLength2(double baseLength2) {
        this.baseLength2 = baseLength2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseLength1 + baseLength2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, baseLength1: " + baseLength1 + " units, baseLength2: " + baseLength2
                + " units, height: " + height
                + " units, color: " + getColor().toLowerCase());
    }
}
