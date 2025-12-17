package core.basesyntax;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.1f", calculateArea()) + " sq. units, side: "
                + String.format("%.1f", side) + " units, color: "
                + getColor().toLowerCase());
    }
}
