package core.basesyntax;

public class IsTrapezoid extends Figure implements Drawable {
    public static final int RANGE = 10;
    private double base;
    private double top;
    private double height;

    public IsTrapezoid() {
        this.base = Math.random() * RANGE;
        this.top = Math.random() * RANGE;
        this.height = Math.random() * RANGE;
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
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", getArea())
                + " sq. units, height: " + String.format("%.1f", height)
                + " units, color: " + getColor());
    }
}
