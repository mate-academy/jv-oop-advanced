package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base1;
    private final int base2;

    public RightTriangle(String figureProperty, String color, int base1, int base2) {
        super(figureProperty, color);
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureProperty() + ", area: " + getArea()
                + " square units, hypotenuse: " + hypotenuse()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return base1 * base2 / 2.0;
    }

    public double hypotenuse() {
        return Math.hypot(base1, base2);
    }
}
