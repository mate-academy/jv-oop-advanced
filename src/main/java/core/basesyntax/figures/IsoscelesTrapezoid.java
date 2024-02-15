package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double bottom;
    private double top;
    private double height;

    public IsoscelesTrapezoid(String color, double bottom, double top, double height) {
        super(color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;

    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area()
                + "sq. units, first side: " + bottom + "units, second side: "
                + top + "units, height:  " + height + "units, color: "
                + color);
    }

    @Override
    public double area() {
        return (bottom + top) * 0.5 * height;
    }
}
