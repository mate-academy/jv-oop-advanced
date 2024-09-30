package core.basesyntax;

public class Square extends Figure {
    private final double sideLength;

    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, side: %f, radius: %f, color: %s\n",
                getArea(),
                sideLength,
                color
        );
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }
}
