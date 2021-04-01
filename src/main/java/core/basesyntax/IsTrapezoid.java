package core.basesyntax;

public class IsTrapezoid extends Figure implements Drawable {
    private double base;
    private double top;
    private double height;

    public IsTrapezoid(Double base, Double top, Double height, String color) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (base + top) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", getArea())
                + " sq. units, height: " + String.format("%.1f", height)
                + " units, color: " + getColor());
    }
}
