package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Square: "
                + "sides = " + side
                + ", color = " + getColor()
                + ", area = " + calculateArea() + '.');
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
