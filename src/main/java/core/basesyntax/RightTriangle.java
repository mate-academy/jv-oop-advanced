package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, side length: " + getSide() + " units, color: " + getColor();
    }
}
