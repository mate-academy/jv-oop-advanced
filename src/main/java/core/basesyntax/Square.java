package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtainArea() + " sq. units, side: "
                + side + ", color: " + getColor());
    }
}
