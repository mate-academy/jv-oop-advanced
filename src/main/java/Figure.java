public abstract class Figure implements AreaCalculator, FigureSketch {
    private String color;
    private FigureType figureType;

    public Figure(String color,FigureType figureType) {
        this.color = color;
        this.figureType = figureType;
    }

    public String getColor() {
        return color;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public enum FigureType {
        SQUARE,
        RECTANGLE,
        TRIANGLE,
        CIRCLE,
        TRAPEZOID,
        RHOMBUS
    }
}
