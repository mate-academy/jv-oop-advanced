package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getAreaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getAreaCalculator()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
