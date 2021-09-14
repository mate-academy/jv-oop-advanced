package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
