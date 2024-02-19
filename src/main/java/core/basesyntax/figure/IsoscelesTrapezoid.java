package core.basesyntax.figure;

public class IsoscelesTrapezoid extends RightTriangle {
    private final int secondBase;

    public IsoscelesTrapezoid(String color, int base, int height, int secondBase) {
        super(color, base, height);
        this.secondBase = secondBase;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() + (double) height / 2 * secondBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + calculateArea()
                + " sq. units, base: " + base
                + " sq. units, secondBase: " + secondBase
                + " units, height: " + height
                + " units, color: " + color);
    }
}
