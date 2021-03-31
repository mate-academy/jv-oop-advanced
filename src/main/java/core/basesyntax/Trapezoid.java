package core.basesyntax;

public class Trapezoid extends Figure {
    private final int side1;
    private final int side2;
    private final int height;

    public Trapezoid(String color, int side1, int side2, int height) {
        super("trapezoid", color,"height");
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((side1 + side2) * height) / 2D;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, %s length: %d units, color: %s%n",
                getUniqueProperty(), calculateArea(), getName(),
                height, getColor());
    }
}
