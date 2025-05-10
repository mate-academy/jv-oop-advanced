package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square,\n"
                + "area: " + getArea() + " sq. units,\n"
                + "side: " + side + " units,\n"
                + "color: " + getColor() + "\n");
    }
}
