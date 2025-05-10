package core.basesyntax.figure;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureList.SQUARE + ", area: "
                + getArea() + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
