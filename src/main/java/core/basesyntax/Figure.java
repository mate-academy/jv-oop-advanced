package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
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

    public String getColorString() {
        return color.toString().toLowerCase();
    }
}
