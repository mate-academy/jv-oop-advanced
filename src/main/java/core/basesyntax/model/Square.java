package core.basesyntax.model;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = Math.pow(side, 2);
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass()
                + ": square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units"
                + ", color: " + getColor());
    }
}
