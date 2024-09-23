package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.round((side * side) * 10.0 / 10.0);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: "
                        + calculateArea()
                        + " sq. units, side: "
                        + side
                        + " units, color: "
                        + color);
    }
}
