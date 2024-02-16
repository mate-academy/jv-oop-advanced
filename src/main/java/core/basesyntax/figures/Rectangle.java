package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s\nArea: %.2f\nFirst side: %d\nSecond side: %d\nColor: %s\n\n",
                getClass().getSimpleName(), getArea(), firstSide, secondSide, getColor());
    }
}
