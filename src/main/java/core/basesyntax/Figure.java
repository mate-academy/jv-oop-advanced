package core.basesyntax;

public abstract class Figure implements Description, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected String getColor() {
        return color.name().toLowerCase();
    }
}
