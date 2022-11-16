package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + this.getArea() + " sq.units, side: "
                + this.side + " units, color: "
                + this.getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
