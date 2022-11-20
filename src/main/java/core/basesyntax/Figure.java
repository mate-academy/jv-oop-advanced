package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDraw {
    private Color color;
    private String name;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
