package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double top;
    private double bottom;
    private double height;

    public IsoscelesTrapezoid(String color, double top, double bottom, double height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + " area: " + getArea()
                + "sq. units, top: " + top
                + " units, bottom: " + bottom
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
