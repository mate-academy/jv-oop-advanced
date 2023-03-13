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
    public void draw() {
        System.out.println("Figure: Square, " + "area: " + getArea() + " units, "
                + "side: " + side + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
