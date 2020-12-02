package core.basesyntax;

public class TrapezoidIsosceles extends Figure {

    private double height;
    private double base;
    private double top;

    TrapezoidIsosceles(double base, double top, double height, Color color) {
        super(color);
        setBase(base);
        setTop(top);
        setHeight(height);
        setArea(getBase(),getTop(),getHeight());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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

    public void setArea(double base, double top, double height) {
        super.setArea((base + top) * 0.5 * height);
    }

    @Override
    public String draw() {
        return "Figure: trapezoid isosceles, area: " + getArea() + " sq. units"
                + " height: " + getHeight() + " units, width: "
                + getBase() + " units height: " + getHeight()
                + " units, color: " + getColor();
    }
}
