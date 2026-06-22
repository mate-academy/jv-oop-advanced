package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int i) {
        super(color);
        this.side = i;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + "circle " + " area " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
