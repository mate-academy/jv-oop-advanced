package core.basesyntax;

public class Figure implements FigureInterface, DrawFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getFigureArea() {
        return 0;
    }

    @Override
    public void drawFigure() {
    }
}
