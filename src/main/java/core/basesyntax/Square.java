package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.2f", getArea())
                + ", side: " + side + ", color: " + color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
