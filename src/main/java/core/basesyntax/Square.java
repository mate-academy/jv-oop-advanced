package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, Color color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}
