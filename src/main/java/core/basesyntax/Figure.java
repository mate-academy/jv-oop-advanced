package core.basesyntax;

public class Figure implements Drawable, AreaCalculate {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void drawFigure() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
