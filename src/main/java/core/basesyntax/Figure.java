package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawableFigure {
    private String color;

    public Figure(String color) {
        this.setColor(color);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
