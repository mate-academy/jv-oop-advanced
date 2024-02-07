package core.basesyntax.models;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    protected void setSide(double side) {
        this.side = side;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq.units, side: %.2f units, color: %s%n",
                getClass().getSimpleName(),
                getArea(),
                side,
                color.toLowerCase()
        );
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
