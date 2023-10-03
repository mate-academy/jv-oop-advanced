package core.basesyntax;

public class Square extends Figure {
    private int side;
    private Color color;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square "
                + " area " + calculateArea() + " sq.units,"
                + " side " + side + " units"
                + " color " + color);
    }
}
