package core.basesyntax;

public abstract class Figure implements AreaCalculate {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String drawArea();

    public String getColor() {
        return color;
    }
}
