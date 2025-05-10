package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private String color;
    private String name;

    public Figure(String color, String figuresName) {
        this.color = color;
        this.name = figuresName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
