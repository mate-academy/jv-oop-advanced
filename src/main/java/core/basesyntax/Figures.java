package core.basesyntax;

public abstract class Figures implements Draw {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();
}
