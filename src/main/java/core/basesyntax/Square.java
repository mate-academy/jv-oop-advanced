package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + super.getColor().toLowerCase();
    }
}
