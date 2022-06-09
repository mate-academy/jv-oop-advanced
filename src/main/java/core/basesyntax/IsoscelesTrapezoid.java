package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int height;
    private String color = String.valueOf(ColorSupplier.getRandomColor());

    public IsoscelesTrapezoid(int bottom, int top, int height) {
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units , bottom: " + bottom + " units, top: "
                + top + " units, height: " + height
                + " units, color: " + color);
    }
}
