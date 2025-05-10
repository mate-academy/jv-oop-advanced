package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.unit, side: " + getSide()
                + " units, color: " + getColor());
    }
}
