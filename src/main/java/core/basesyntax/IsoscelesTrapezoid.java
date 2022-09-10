package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(double base, double top, double height, String color) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getTop() {
        return top;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * ((this.base + this.top) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, base: " + String.format("%.1f", base)
                + " units, top: " + String.format("%.1f", top)
                + " units, height: " + String.format("%.1f", height)
                + " units, color: " + this.getColor());
    }
}
