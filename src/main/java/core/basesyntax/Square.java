package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw(Figure figure) {
        System.out.println("Figure: Square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}
