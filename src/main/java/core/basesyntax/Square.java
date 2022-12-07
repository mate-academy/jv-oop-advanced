package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
                + "area: " + String.format("%.2f", getArea()) + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor() + ".");
    }
}
