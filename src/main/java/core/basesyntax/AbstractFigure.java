package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private String color;
    private static final String FIGURE_INFO_FORMAT = "Figure: %s, area: %.2f sq. units, color: %s";

    public AbstractFigure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public void draw() {
        String figureInfo = String.format(FIGURE_INFO_FORMAT,
                this.getClass().getSimpleName(), getArea(), color);
        System.out.println(figureInfo);
    }

    @Override
    public String getColor() {
        return color;
    }
}
