package core.basesyntax.model;

public class Square extends Figure {
    private static final double CONST_OF_AREA_EXPRESSION = 2;
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, CONST_OF_AREA_EXPRESSION);
    }

    @Override
    public void draw() {
        System.out.println(super.getClass()
                + ": square, "
                + "area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units"
                + ", color: " + getColor().name());
    }
}
