package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("This figure is isosceles trapezoid: color: " + color + ", base 1: " + roundToTwoDecimals(base1)
                + ", base 2: " + roundToTwoDecimals(base2) + ", height: " + roundToTwoDecimals(height) + " area: " + roundToTwoDecimals(getArea()) + ".");
    }

}
