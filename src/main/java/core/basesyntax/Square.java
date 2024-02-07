package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainTheArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtainTheArea() + " sq.units, side: "
                + this.side + " units, color: " + super.getColor().toLowerCase());
    }
}
