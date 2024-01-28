package core.basesyntax;

public class Square extends Figure {
    private int base;

    public Square(int base, String color) {
        super(color);
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return base * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + calculateArea()
                + " sq. units, base: "
                + base
                + ", color: "
                + getColor());
    }
}
