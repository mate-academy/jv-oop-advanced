package core.basesyntax;

public abstract class Figure implements IFigure {
    private String name;
    private Color color;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    protected abstract double areaCalculation();
}
