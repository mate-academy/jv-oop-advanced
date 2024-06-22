package core.basesyntax;

public class Square extends Figure {
    private double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.2f sq. cm, length: %.2f cm, color: %s.%n",
                getArea(), length, color);
    }
}
