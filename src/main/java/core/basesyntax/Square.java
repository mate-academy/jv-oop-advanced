package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area() + " units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (double)(side * side);
    }
}
