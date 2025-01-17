package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) Math.round(side * side * 100) / 100;
    }

    @Override
    public void draw() {

        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + color);

    }
}
