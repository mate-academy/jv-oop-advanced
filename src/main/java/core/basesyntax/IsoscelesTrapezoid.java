package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int bottom, int top, int height) {
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (bottom + top) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Isosceles Trapezoid, " + "area: " + this.getArea()
                           + " sq. units, bottom: " + this.bottom + " units, top: " + this.top
                           + "units, height: " + this.height + " units, color: "
                           + super.getColor().name());
    }
}

