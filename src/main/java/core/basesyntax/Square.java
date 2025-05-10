package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + areaCalculator() + " sq. units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }
}
