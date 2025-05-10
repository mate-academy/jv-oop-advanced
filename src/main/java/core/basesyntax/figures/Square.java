package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                                                    + "side: " + side + " units, "
                                                    + "color: " + color);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
