package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
