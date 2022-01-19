package core.basesyntax;

public abstract class Figures implements Todraw {
    private String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}
