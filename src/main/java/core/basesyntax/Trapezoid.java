package core.basesyntax;

public class Trapezoid extends Figure implements Drawable, AreaCalculator {
    private double base;
    private double top;

    public Trapezoid() {
        this.base = 1 + Math.random() * 15;
        this.top = 1 + Math.random() * 15;
    }

    @Override
    public double getArea() {
        return (base * top) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getTop() {
        return top;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + String.format("%.2f",getArea())
                + " sq.units, top: "
                + String.format("%.2f",getTop()) + " units, base: "
                + String.format("%.2f",getBase()) + " units, color: " + getColor());
    }
}
