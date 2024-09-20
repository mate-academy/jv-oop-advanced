package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(Color color, double sideLength) {
        super(color, Math.pow(sideLength, 2));
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, side: %f, radius: %f, color: %s\n",
                area,
                sideLength,
                color
        );
    }
}
