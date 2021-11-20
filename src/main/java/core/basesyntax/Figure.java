package core.basesyntax;

public class Figure implements AreaCalculating, FigureDrawing {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String drawFigure() {
        return null;
    }
}
