package core.basesyntax;

public class FigureParent implements Figure, GetArea {
    private final String color;

    public FigureParent(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {

    }

    @Override
    public double findArea() {
        return 0;
    }

    public double roundTo(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
