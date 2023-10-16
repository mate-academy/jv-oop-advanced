package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void drow() {
        System.out.println("Figure: Square, color: " + getColor()
                + ", side: " + side + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return (side * side);
    }
}
