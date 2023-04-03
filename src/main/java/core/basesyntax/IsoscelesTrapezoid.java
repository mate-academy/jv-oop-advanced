package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    double a, b, h;
    Color color;

    IsoscelesTrapezoid(double a, double b, double h, Color color) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt(((a + b) / 2) * h);
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, side: " + a + "," + b + " height: " + h + " units, color: " + getColor();
    }
}
