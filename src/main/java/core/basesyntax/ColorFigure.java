package core.basesyntax;

public class ColorFigure implements Figure {
    private String color;

    public ColorFigure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}


