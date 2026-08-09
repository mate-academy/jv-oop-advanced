package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Square, color: " + color
                + ", side: " + side + ", area: " + calculateArea());
    }
}
