package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square. Color: " + getColor() + ". Area: " + calculateArea()
                + ". Side: " + side + '.');
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
