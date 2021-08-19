package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, String figure, int side) {
        super(color, figure);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure " + getType() + " area " + getArea() + " sq.u., side "
                + side + " u., color " + getColor();
    }
}
