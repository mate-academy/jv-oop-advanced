package core.basesyntax;

public abstract class Figure implements AreaCalculator, PrintInfo {
    private String color;
    protected double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
