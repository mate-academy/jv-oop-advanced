package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
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
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + getSide()
                + ", color='" + getColor()
                + ", area='" + calculateArea()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
