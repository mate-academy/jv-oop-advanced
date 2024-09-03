package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int base;
    private final int height;

    public IsoscelesTrapezoid(String color, int base) {
        super(color);
        this.base = base;
        this.height = (int) ((base * Math.sqrt(3) / 2));
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    public void draw() {
        System.out.println("Figure: trapezoid" + " area: " + area() + " firsBase: " + base
                            + " units" + " secondBase: " + base + " units" + " height: " + height
                            + " units" + " color: " + color);
    }
}
