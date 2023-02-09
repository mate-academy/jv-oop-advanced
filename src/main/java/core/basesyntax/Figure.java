package core.basesyntax;

public abstract class Figure implements AreaCalculator, Paint {
    private Color color;
    private String figureType;

    public Figure(Color color) {
        this.color = color;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
