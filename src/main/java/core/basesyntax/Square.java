package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Square " + " area: " + getArea() + ","
                + " side: " + side + "," + " color: " + super.getColor());
    }
}
