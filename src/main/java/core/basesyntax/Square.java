package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square" + ", color: " + getColor()
                + ", side: " + side
                + ", area: " + calculateArea());
    }
}
