package core.basesyntax;

public class Square extends Figure {
    private static int side;

    public Square(String color, int side) {

        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + side + " units, color: " + color);
    }
}
