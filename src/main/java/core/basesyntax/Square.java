package core.basesyntax;

public class Square extends Figure {
    private final double base;

    public Square(String color, double base) {
        super(color);
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + base + " units, color: " + getColor());
    }
}
