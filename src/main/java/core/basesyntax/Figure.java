package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawAble {
    private Color color;
    private final String name;

    public Figure(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
