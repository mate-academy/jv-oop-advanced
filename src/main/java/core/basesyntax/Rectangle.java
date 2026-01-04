package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double base;

    public Rectangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format(java.util.Locale.US,"%.2f", getArea())
                + " sq. units, base: "
                + base
                + " units, height: "
                + height
                + " units, color: "
                + color);
    }
}
