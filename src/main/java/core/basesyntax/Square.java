package core.basesyntax;

public class Square extends Figure {
    private final int side;
    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Figure: Square, " + ", area: " + getArea()
                + ", side: " + side + ", color: " + getColor());
    }
}
