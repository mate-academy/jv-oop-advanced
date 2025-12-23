package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("Square side must be greater than 0");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getTypeFigure() {
        return "Square";
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea()
                + " sq. units" + " with side: " + getSide()
                + " units," + " color: " + getColor();
    }

    public double getSide() {
        return side;
    }
}
