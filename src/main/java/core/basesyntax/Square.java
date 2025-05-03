package core.basesyntax;

public class Square implements Figure {
    private final double side;
    private final FigureColor color;

    public Square(double side, FigureColor color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + color.name());
    }

    @Override
    public FigureColor getColor() {
        return color;
    }
}
