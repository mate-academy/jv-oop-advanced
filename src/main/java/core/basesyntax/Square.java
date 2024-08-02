package core.basesyntax;

public class Square extends Figure implements AreaCalculetion {
    private double side;

    public Square(double side, String color, String name) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return getSide() * 2;
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor();
    }
}
