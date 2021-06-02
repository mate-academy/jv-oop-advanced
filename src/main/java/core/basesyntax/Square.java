package core.basesyntax;

public class Square extends Shape implements Printable {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double figureArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println(String.format("Figure: square, area: %s, side: %s, color: %s",
                figureArea(), side, getColor()));
    }
}
