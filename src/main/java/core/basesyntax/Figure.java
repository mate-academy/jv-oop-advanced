package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final int MAX_RANDOM_SIDE_VALUE = 100;

    private final Color color;
    private String name;

    public Figure(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color.toString().toLowerCase();
    }
}
