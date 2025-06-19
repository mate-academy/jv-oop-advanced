package core.basesyntax;

public class Square extends FigureBase {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: square, area: %.2f sq. units, side: %.2f units, color: %s",
                getArea(), sideLength, color
        ));

    }
}