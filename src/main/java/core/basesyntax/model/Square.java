package core.basesyntax.model;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(side, 2);
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass()
                + ": square, "
                + "area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units"
                + ", color: " + getColor());
    }
}
