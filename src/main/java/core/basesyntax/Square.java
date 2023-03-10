package core.basesyntax;

public class Square implements Figure {
    private final FigureColor color;
    private final double sideLength;

    public Square(FigureColor color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Square: side Length = "
                + sideLength
                + ", color = "
                + color
                + ", area = "
                + getArea() + " sq.units.");
    }
}
