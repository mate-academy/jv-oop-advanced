package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.side = side;
        super.color = color;
    }

    public double getSide() {
        return side;
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
