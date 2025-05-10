package core.basesyntax;

public abstract class Figure implements DrawIt, AreaCalculator {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigureType() {
        return getClass().getSimpleName();
    }
}
