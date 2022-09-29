package core.basesyntax;

public class Square extends Figure implements FiguresArea, Drawable {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
