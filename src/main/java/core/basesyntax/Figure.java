package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public static final int MAX_VALUE_SIDE = 100;
    private final Color color;
    private String name;

    public Figure(Color color, String name) {
        this.color = color;
        this.name = name;
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
