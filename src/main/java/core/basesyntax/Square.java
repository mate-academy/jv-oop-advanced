package core.basesyntax;

public class Square extends Figure {

    private final int side;
    private String color;

    public Square(int side) {
        this.side = side;
    }

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor());
    }

}
