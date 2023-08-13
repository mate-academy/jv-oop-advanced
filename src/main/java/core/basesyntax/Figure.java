package core.basesyntax;

public class Figure implements FigurePainter, AreaCalculator {
    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void toDraw() {

    }
}
