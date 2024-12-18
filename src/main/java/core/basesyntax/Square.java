package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
