package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int base1;
    private int base2;
    private String color = getColor();

    public IsoscelesTrapezoid(int height, int base1, int base2, String color) {
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
        this.color = color;
    }

    @Override
    public double areaCalculator() {
        return (((double) (base1 * base2) / 2) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + areaCalculator()
                + ", height: " + height + ", sides: " + base1 + " and " + base2
                + ", color: " + color);
    }
}
