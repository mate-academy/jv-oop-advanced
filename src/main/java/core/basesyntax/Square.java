package core.basesyntax;

public class Square extends Figure {
    private final double sideA;
    private final String color;

    public Square(double sideA, String color) {
        this.sideA = sideA;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    public void draw() {
        System.out.printf("Figure: %s, Area: %f sq. units, Side A: %f units, Color: %s\n",
                this.getClass().getSimpleName(), calculateArea(), sideA, color);
    }
}
