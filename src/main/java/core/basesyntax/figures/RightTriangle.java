package core.basesyntax.figures;

public class RightTriangle extends Figure {

    private static final String OUTPUT_RIGHT_TRIANGLE = "Figure: rightTriangle, "
            + "area: %.2f sq. units, "
            + "base: %.2f units, "
            + "height: %.2f units, "
            + "color: %s";
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        this.area = 0.5 * base * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println(String.format(OUTPUT_RIGHT_TRIANGLE,
                calculateArea(),
                this.base,
                this.height,
                getColor()
        ));
    }
}
