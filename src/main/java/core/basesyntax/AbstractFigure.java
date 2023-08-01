package core.basesyntax;

public abstract class AbstractFigure implements Figure, CalculateArea {
    protected String name;
    protected Color color;

    public AbstractFigure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + String.format("%.2f", getArea())
                + " sq.units, color: " + color);
    }
}
