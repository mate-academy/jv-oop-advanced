package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private FigureName name;
    private Color color;
    //private double area;

    Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FigureName getName() {
        return name;
    }

    public void setName(FigureName name) {
        this.name = name;
    }
}
