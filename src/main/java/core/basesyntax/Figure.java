package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract String draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
