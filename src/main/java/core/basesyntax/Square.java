package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.side = side;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + "sq. units, side: " + side + ", color: "
                + getColor()
                + ".");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
