package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        super.color = color;
        super.area = findArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + super.area
                + " sq.units, side: " + this.side
                + " units, color: " + super.color);
    }

    @Override
    protected double findArea() {
        double unformattedArea = side * side;
        return Math.round(unformattedArea * 1000.0) / 1000.0;
    }
}
