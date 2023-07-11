package core.basesyntax;

public class Square extends Figure{
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
    public void draw() {
        System.out.println("Figure: " + "Square, area: " + getArea() +
                " sq.units," + "side: " + side + " units, " + "color: " + color);
        //       Figure: square, area: 25.0 sq.units, side: 5 units, color: blue

    }
}
