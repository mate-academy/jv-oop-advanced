package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int base1;
    private final int base2;

    public IsoscelesTrapezoid(int height, int base1, int base2, String color) {
        super(color);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double calculateArea() {
        return (((double) (base1 * base2) / 2) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + ", height: " + height + ", sides: " + base1 + " and " + base2
                + ", color: " + getColor());
    }
}
