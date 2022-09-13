package core.basesyntax;

public class Figure implements AreaCalculator, DrawingFigure {
    private String color;

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return null;
    }
}
