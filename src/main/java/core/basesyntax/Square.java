package core.basesyntax;

public class Square extends Figure {
    private final String name = "Square";
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return (this.side * this.side);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, side:  " + getSide()
                + " units, color: " + getColor());
    }

}
