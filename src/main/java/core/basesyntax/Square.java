package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side) {
        super();
        super.setType("square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + ", area: " + this.getArea() + " sq.units, side: " + this.side + " units, color: " + super.getColor());
    }
}
