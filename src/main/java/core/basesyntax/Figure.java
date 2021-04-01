package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
