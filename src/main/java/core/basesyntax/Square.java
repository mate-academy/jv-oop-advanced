package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + calculateArea() + " sq. units, "
                        + "side: " + side + " units, "
                        + "color: " + getColor()
        );

    }
}
