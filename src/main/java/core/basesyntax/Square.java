package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return this.getClass().getSimpleName() + "{ side: " + side + " units , area: "
                + getArea() + " square units, color: " + getColor() + " }";
    }
}
