package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public static final int MAX_VALUE_SIDE = 100;
    private final Color color;
    private String name;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
