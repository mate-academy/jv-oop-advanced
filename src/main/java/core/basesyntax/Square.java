package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + color);
    }
}
