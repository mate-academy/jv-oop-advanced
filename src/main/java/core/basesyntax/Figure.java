package core.basesyntax;

public abstract class Figure implements AreaCalculation, DrawFigure {
    private String color;

    public String getColor() {
        return color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();
}
