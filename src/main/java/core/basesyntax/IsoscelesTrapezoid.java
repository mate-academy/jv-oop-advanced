package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int baseBottom;
    private int baseTop;

    public IsoscelesTrapezoid(int baseBottom, int baseTop, int height, String color) {
        super(color);
        this.baseBottom = baseBottom;
        this.baseTop = baseTop;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseTop + baseBottom) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + calculateArea()
                + " sq. units, top base: "
                + baseTop
                + ", bottom base: "
                + baseBottom
                + ", height: "
                + height
                + ", color: "
                + getColor());
    }
}
