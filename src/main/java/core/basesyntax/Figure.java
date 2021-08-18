package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private String color;
    private String name;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
