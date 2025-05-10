package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, String name, int side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ","
                + " area:" + getArea() + " sq. units, side length: "
                + side + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + side
                + '}';
    }
}
