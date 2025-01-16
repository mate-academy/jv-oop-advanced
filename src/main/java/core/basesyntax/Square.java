package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.2f", getArea())
                + " sq. units, side: " + String.format("%.2f", side)
                + " units, color: " + super.color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
