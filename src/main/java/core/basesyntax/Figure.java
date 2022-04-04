package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDescription {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{"
                + "color='" + color + '\''
                + '}';
    }

}
