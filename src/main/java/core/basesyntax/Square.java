package core.basesyntax;

public class Square extends Figures implements Behaviour {
    private int side;
    private final String name = "square";

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, side: " + side + " units, color: " + getColor();
    }
}
