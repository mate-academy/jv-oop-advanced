package core.basesyntax;

public abstract class Figure implements AriaCalculation, DrawFigure {
    public String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void drawFigure();
}
