package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
}
