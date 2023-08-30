package core.basesyntax;

public abstract class FigureAbstract implements Drawable, AreaCalculator {
    private String name;
    private String color;

    protected FigureAbstract(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name.toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }
}
