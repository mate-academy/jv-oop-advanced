package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(Color color) {
        super(color);
    }

    public IsoscelesTrapezoid(Color color, int top, int bottom, int height) {
        this(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((top + bottom) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq.units, top = "
                + getTop() + " units, bottom = "
                + getBottom() + " units, height = "
                + getHeight() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
