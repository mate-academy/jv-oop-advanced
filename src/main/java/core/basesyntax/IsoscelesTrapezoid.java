package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(String color, int top, int bottom, int height) {
        super(color);
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
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq.units, side: " + top + " units, bottom: " + bottom
                + "units, height: " + height + " units, color: " + getColor());

    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * height;
    }
}

