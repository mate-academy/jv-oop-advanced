package core.basesyntax;

public class Figure implements FigureProcess, FigureDrawing {
    private String color;

    public Figure() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: ";
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
