package core.basesyntax;

public abstract class Figure
        implements FigureArea, FigureDrow {
    private String color;
    private String figureType;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public String getColor() {
        return color;
    }

    public String getFigureType() {
        return figureType;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getClass().getName() + ", color:" + color;
    }

    public abstract String drow();

    @Override
    public abstract double area();
}
