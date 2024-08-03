package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color, String name) {
        this.side = side;
        setColor(color);
        setName(name);
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor();
    }
}
