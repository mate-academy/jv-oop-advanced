package core.basesyntax;

public abstract class Figure implements FigureBehavior, FigureProperties {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
