package core.basesyntax;

public abstract class Figure implements FiguresArea, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{"
                + "color='"
                + color + '\''
                + '}';
    }
}
