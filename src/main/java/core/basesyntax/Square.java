package core.basesyntax;

public class Square extends AbstractFigure implements Figure {
    private double side;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
