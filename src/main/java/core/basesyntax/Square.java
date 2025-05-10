package core.basesyntax;

public class Square extends Figure {
    private static final double ROUNDING_SCALE = 10.0;

    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.SQUARE.name()
                + ", area: " + Math.round(getArea() * ROUNDING_SCALE) / ROUNDING_SCALE
                + " sq. units, "
                + "side: " + Math.round(side * ROUNDING_SCALE) / ROUNDING_SCALE
                + " units, "
                + "color: " + getColor().name() + ".");
    }
}
