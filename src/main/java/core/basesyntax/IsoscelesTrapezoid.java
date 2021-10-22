package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double top;
    private double bottom;

    public IsoscelesTrapezoid(String color, double height, double top, double bottom) {
        super(color);
        this.height = height;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ", color: " + getColor()
                + ", height: " + height
                + ", top: " + top
                + ", bottom: " + bottom);
    }
}
