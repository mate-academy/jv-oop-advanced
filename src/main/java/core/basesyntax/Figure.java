package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private String title;
    private String color;

    public Figure(String title, String color) {
        this.title = title;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }
}
