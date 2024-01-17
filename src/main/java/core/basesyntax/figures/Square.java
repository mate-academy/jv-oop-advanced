package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getStringFormat(calculateArea())
                + " sq. units, side: " + getStringFormat(side) + " units, "
                + "color: " + getColor());
    }
}
