package core.basesyntax;

public class Figure implements DrawFigure, AreaCalculator {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
