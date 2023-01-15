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
    public void Draw() {
        System.out.println("Figure: Square {" + "side: " + side + " units"
                + ", color: " + getColor() + ", area: " + getArea() + " sq.units" + '}');
    }
}

