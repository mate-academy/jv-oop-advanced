package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color =color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + getArea() + " sq.units" +
                ", side=" + side + " units" +
                ", color='" + color + '\'' +
                '}';
    }
}
