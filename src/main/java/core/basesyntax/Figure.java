package core.basesyntax;

public abstract class Figure implements AreaComputable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String drawFigure() {
        return String.format("Some figure with color: %s", getColor());
    }
}
