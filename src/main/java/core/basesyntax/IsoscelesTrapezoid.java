package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double height;

    public IsoscelesTrapezoid(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + area()
                + "sq. units, base: "
                + base
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + getColor();
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
