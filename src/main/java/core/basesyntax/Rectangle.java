package core.basesyntax;

public class Rectangle implements Figure {
    double a, b;
    Color color;

    Rectangle(double a, double b, Color color) {
        this.color = color;
        this.a = a;
        this.b = b;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt(a * b);
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, side: " + a + "," + b + " units, color: " + getColor();
    }
}
