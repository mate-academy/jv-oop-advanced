package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq. units, side length: " + side
                + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
