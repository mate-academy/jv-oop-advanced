package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private final String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, color: %s\n",
                getClass().getSimpleName(), calculateArea(), color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
