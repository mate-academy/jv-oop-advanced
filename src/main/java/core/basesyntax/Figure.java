package core.basesyntax;

public abstract class Figure implements Drowing, AreaCalculator {
    public Figure(String color) {
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
