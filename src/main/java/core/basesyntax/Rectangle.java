package core.basesyntax;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {

        return a * b;
    }

    @Override
    public void draw() {
        System.out.printf("Figure Rectangle, area: %.1f"
                            + " sq. units, side a: %.1f"
                            + " units, side b: %.1f"
                            + " units, color: %s",
                            area(), a, b, color);
    }
}
