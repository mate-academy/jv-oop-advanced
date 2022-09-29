package core.basesyntax;

public class Figure implements AreaComputable {
    private static final FigureShape FIGURE_SHAPE = FigureShape.CIRCLE;
    private static final double RADIUS = 10;
    private static final Color color = Color.WHITE;

    public Figure() {

    }

    @Override
    public String toString() {
        return String.format("Figure: %s, area: %f sq.units, color: %s",
                FIGURE_SHAPE.name().toLowerCase(), getArea(), color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(RADIUS,2);
    }
}
