package core.basesyntax;

public class Square extends Figure {
    private final double side = SIDE;

    public double getSide() {
        return side;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.area()
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
