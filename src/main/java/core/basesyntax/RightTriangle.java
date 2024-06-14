package core.basesyntax;

public class RightTriangle extends Figure {

    private static final String OUTPUT_RIGHT_TRIANGLE = "Figure: rightTriangle, "
            + "area: %.2f sq. units, "
            + "base: %.2f units, "
            + "height: %.2f units, "
            + "color: %s";
    private double base;
    private double height;

    public RightTriangle() {
        super();
    }

    public RightTriangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.printf(OUTPUT_RIGHT_TRIANGLE,
                calculateArea(),
                base,
                height,
                color
        );
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
