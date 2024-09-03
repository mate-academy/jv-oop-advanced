package core.basesyntax;

public class IsoscelesTrapezoid extends FigureColor {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, Color color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1 + " units, base2: "
                + base2 + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }
}
