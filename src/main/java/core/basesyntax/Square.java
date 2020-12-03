package core.basesyntax;

public class Square extends Figure {
    public static final String NAME = "Square";
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, side:  " + getSide()
                + " units, color: " + getColor());
    }

}
