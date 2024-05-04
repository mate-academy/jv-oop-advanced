package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public void draw() {
        String figureInfo = String.format("Figure: %s, area: %.2f sq. units, color: %s",
                this.getClass().getSimpleName(), getArea(), color);
        System.out.println(figureInfo);
    }
}
