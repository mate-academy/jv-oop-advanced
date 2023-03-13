package core.basesyntax;

public abstract class Figure implements FigureInterface, Drawer {
    private Color color;
    private FigureType type;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FigureType getType() {
        return type;
    }

    public void setType(FigureType type) {
        this.type = type;
    }

    public abstract void draw();
}
