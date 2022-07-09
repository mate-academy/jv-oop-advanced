package core.basesyntax;

public abstract class Figures implements AreaCalculator, Draw {
    private String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
