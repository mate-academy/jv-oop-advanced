package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        String line = "Figure: Square, area: ";
        System.out.println(line + calculateArea() + ", side: " + side + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
