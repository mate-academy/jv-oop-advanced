package core.basesyntax.figure;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square{"
                + "area=" + calculateArea()
                + ", side=" + side
                + ", color=" + color.name()
                + '}');
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
