package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double leg) {
        super(color);
        this.side = leg;
    }

    public double getLeg() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
