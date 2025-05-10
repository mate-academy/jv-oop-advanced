package core.basesyntax;

public abstract class Figure implements FigureArea, DrawAble {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
