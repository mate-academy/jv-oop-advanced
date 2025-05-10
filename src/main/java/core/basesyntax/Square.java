package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super("square", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getShape() + ", area: "
                + this.getArea() + " sq.units, side: "
                + this.side + " units, color: "
                + this.getColor());
    }
}
