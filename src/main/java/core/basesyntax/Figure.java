package core.basesyntax;

public abstract class Figure implements Printable {
    private String figureType;
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract double countArea();

}
