package core.basesyntax;

public class Square extends Figure {
    private double side;

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square, "
                + "area: " + area() + " sq.units, "
                + "side: " + this.side + " units, "
                + "color: " + getColor());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
