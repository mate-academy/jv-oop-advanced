package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
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
        System.out.println("Figure: square, area: " + this.getArea()
                + " sq. units, side: " + this.side
                + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
