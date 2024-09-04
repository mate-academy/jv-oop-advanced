package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color,int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void printProperties() {
        System.out.println("Figure: square, " + "area: " + calculateArea() + " sq. units,"
                            + " length: " + side + " units," + " width: "
                            + side + " units," + " color:" + color);

    }
}
