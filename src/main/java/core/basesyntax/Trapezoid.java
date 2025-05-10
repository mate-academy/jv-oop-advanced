package core.basesyntax;

public class Trapezoid extends Figure {
    private final int sideOne;
    private final int sideTwo;
    private final int height;

    public Trapezoid(String color, int sideOne, int sideTwo, int height) {
        super("trapezoid", color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((sideOne + sideTwo) * height) / 2D;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, height length: %d units, color: %s%n",
                getName(), calculateArea(), height, getColor());
    }
}
