package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private static final double DEFAULT_AREA_FACTOR = 0.5;
    private static final String FIGURE_TYPE = "right triangle";
    private static final String DRAW_FORMAT = "Figure: %s, area: %.2f sq. units, base: %.2f units, height: %.2f units, color: %s";

    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return DEFAULT_AREA_FACTOR * base * height;
    }

    @Override
    public void draw() {
        String figureInfo = String.format(DRAW_FORMAT, FIGURE_TYPE, getArea(), base, height, getColor());
        System.out.println(figureInfo);
    }
}
