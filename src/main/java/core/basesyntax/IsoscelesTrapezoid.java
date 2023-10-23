package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseTop;
    private int baseBottom;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseTop, int baseBottom, int height) {
        super(color);
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) ((baseBottom + baseTop) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top base: " + baseTop
                + " uints, bottom base: " + baseBottom
                + " units, height " + height
                + " units, color: " + getColor().name());
    }
}

