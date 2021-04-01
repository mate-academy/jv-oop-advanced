package core.basesyntax;

public abstract class Figure implements FigureDrawer, AreaCalculator {
    private String id;
    private String color;

    public Figure(String id, String color) {
        this.id = id;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }
}
