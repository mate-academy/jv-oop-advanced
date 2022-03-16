package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double top;
    private double bottom;
    private double height;

    public IsoscelesTrapezoid(String color, double top, double height, double bottom) {
        super(color);
        this.top = top;
        this.height = height;
        this.bottom = bottom;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return height * ((bottom + top) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, color: " + getColor()
                + ", height: " + height
                + ", bottom: " + bottom
                + ", top: " + top);
    }
}
