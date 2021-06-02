package core.basesyntax;

public class Square extends Shape {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double figureArea() {
        return side * side;
    }

    @Override
    void drawFigure() {
        System.out.println(String.format("Figure: square, area: %s, side: %s, color: %s",
                figureArea(), side, color));
    }
}
