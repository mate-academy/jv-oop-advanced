package core.basesyntax;

public class Square extends Figure implements GetArea, Draw {
    private double side;

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: Square, area: " + area() + " sq. units, " + "Side: " + side + ", Color: " + getColor());
    }
}
