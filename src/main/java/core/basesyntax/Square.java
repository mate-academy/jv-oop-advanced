package core.basesyntax;

public class Square extends Figure {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    protected double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea() +
                        ", side: " + side +
                        " units, color: " + getColor()
        );
    }
}

