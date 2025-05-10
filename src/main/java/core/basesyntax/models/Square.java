package core.basesyntax.models;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + ", side: " + side + " units, color: " + getColor();
    }

    @Override
    public String draw() {
        return this.toString();
    }
}
