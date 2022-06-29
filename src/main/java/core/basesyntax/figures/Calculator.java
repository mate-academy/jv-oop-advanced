package core.basesyntax.figures;

public abstract class Calculator implements AreaCalculator, InfoDrawer {
    private String color;

    protected Calculator(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
