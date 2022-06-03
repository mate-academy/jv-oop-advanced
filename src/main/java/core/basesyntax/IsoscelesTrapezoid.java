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
    public double getSquare() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getSquare()
                + " sq.units , bottom: " + bottom + " units, top: "
                + top + " units, height: " + height
                + " units, color: " + getColor());
    }
}
