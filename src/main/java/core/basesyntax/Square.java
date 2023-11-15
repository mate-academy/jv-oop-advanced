package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double calculateArea() {
        return round(side * side);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle"
                        + ", side: " + round(side) + " units"
                        + ", area: " + calculateArea() + " sq. units"
                        + ", color: " + color
        );
    }
}
