package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private double top;
    private double bottom;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getTop() {
        return top;
    }

    public void setHeight(double side) {
        this.height = side;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getArea() {
        return height / 2 * (top + bottom);
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: top "
                + top + " bottom " + " height " + " color: " + getColor() + " area: " + getArea());
    }
}
