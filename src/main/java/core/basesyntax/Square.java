package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String figureProperty, String color, int side) {
        super(figureProperty, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " square units, side length: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}
