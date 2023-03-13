package core.basesyntax.figure;

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

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + calculateArea()
                + " sq.units, top: "
                + top + " units, bottom: " + bottom
                + "units, height: " + height + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return ((top + bottom) / 2.0) * height;
    }
}
