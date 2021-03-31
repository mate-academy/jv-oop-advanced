package core.basesyntax;

public class Triangle extends Figure {
    private final int height;
    private final int base;
    private final int hypotenuse;

    public Triangle(String color, int leg, int base, int hypotenuse) {
        super("triangle", color, "hypotenuse");
        this.height = leg;
        this.base = base;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, %s length: %d units, color: %s%n",
                getUniqueProperty(), calculateArea(), getName(),
                hypotenuse, getColor());
    }
}
