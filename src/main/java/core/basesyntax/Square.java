package core.basesyntax;

public class Square extends Figure {
    private Color color;
    private int side;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        String line = "Figure: Square, area: ";
        System.out.println(line + area() + ", side: " + side + ", color: " + color);
    }

    @Override
    public double area() {
        return side * side;
    }
}
