package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(String color, int side) {
        this.setColor(Color.valueOf(color));
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + side
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", area=" + calculateArea()
                + " sq.units"
                + "side=" + side
                + " units"
                + ", color=" + getColor());
    }
}
