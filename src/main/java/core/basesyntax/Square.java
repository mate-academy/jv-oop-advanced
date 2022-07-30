package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
