package core.basesyntax;

public class Square extends Figures {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void getDraw() {
        String name = "square";
        System.out.println("Figure: " + name + ","
                + " area:" + getArea() + " sq. units, side length: "
                + side + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + side
                + ", color='" + getColor() + '\''
                + '}';
    }
}
