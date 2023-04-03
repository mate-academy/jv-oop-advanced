package core.basesyntax;

public class RightTriangle implements Figure {
    double a, b, c;
    Color color;

    RightTriangle(double a, double b, double c, Color color) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt((a * b) / 2);
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, sides: " + a +
                "," + b + "," + c + " units, color: " + getColor();
    }
}
