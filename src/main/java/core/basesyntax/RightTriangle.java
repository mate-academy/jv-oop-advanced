package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int RIGHT_TRIANGLE_NUMBER = 2;
    private int sideLength;

    public RightTriangle(int sideLength, String color) {
        super(color);
        this.sideLength = sideLength;

    }

    @Override
    public double calculateArea() {
        return (sideLength * sideLength) / RIGHT_TRIANGLE_NUMBER;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq. units, side %d units, color: %s%n",
                calculateArea(), sideLength, color
        );
    }
}

