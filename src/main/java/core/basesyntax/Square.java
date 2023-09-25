package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + color);
    }
}
