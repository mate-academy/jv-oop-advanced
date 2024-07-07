package core.basesyntax;

public abstract class Colorable implements Figure {
    private String color;

    public Colorable(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public void draw() {
    }
}
