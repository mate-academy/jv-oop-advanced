package core.basesyntax;

public abstract class FigureColor implements Figure {
    private String color;

    public FigureColor(String color) {
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
