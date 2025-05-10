package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, double side) {
        super(color);
        this.side = (int) side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
