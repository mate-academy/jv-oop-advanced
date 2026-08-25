package core.basesyntax.figure;

public class IsoscelesTrapezoid extends FigureWithHeight {
    private final double base1;
    private final double base2;

    public IsoscelesTrapezoid(String color, double height, double base1, double base2) {
        super(color, height);
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) * getHeight()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, height: " + super.getHeight() + " units, "
                + "base1: " + base1 + " units, "
                + "base2: " + base2
                + " units, color: " + super.getColor());
    }
}
