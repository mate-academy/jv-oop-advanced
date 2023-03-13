package core.basesyntax;

public class Figure implements AreaCalculator, FigureDrawing {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }

    public String getColor() {
        return color;
    }
}
