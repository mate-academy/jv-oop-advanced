package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int firstLeg, String color) {
        super(color);
        this.side = firstLeg;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, firstLeg: " + side
                + " units, color: " + getColor());
    }
}
