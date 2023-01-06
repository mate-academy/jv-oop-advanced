package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(Shape.SQUARE, color);
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
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getShape() + ", area: " + this.getArea()
                + " sq.units, side: " + side + " sq.units, color: " + this.getColor();
    }
}
