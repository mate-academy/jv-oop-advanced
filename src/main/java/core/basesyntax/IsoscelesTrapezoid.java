package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topLine;
    private final double bottomLine;
    private final double height;

    public IsoscelesTrapezoid(String color, double topLine, double bottomLine, double height) {
        super(color);
        this.topLine = topLine;
        this.bottomLine = bottomLine;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topLine + bottomLine) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea() + "sq. units, "
                + "topLine: "
                + topLine
                + ", bottomLine: "
                + bottomLine
                + ", height: "
                + height
                + ", color: "
                + color);
    }
}
