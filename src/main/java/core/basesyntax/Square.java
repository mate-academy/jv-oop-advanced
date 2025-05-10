package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {

    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square. Side: " + side + " mm. Area: " + getArea() + " sq.mm. Color: "
                + getColor();
    }
}
