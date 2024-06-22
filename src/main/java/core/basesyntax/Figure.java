package core.basesyntax;

public abstract class Figure implements AreaCalculatable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

}
