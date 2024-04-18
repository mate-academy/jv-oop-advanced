package core.basesyntax;

public abstract class Figure implements FigureProperties, FigureBehavior {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
