package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        String line = "Figure: Square, area: ";
        System.out.println(line + calculateArea() + ", side: " + side + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
