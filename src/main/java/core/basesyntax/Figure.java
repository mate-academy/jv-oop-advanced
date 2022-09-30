package core.basesyntax;

public abstract class Figure implements AreaComputable {
    private String color;
    private String figureShape;

    public Figure(String color, String figureShape) {
        this.color = color;
        this.figureShape = figureShape;
    }

    public String getColor() {
        return color;
    }

    public String getFigureShape() {
        return figureShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFigureShape(String figureShape) {
        this.figureShape = figureShape;
    }

    public String drawFigure() {
        return String.format("Figure: %s, color: %s",
                figureShape.toLowerCase(), getColor());
    }
}
