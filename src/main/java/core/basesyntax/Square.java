package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + String.format("%.1f", getArea())
                + " sq. units, side: " + String.format("%.1f", side)
                + " units, color: " + getColor();
    }
}
