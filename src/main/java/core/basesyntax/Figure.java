package core.basesyntax;

public abstract class Figure implements Area, FigureInformation {
    private final String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
