package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(System.lineSeparator()
                + "Circle with area of " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + " color: " + super.getColor()
                + System.lineSeparator()
                + "side:" + side
                + System.lineSeparator());
    }
}
