package core.basesyntax;

public abstract class Figures implements Area, Drawable {
    private String color;
    private String name;

    public Figures(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
