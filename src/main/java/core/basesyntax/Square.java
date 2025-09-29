package core.basesyntax;

public class Square extends Figure {

    private final double side;

    public Square(String randomColor, double randomSide) {
        super(randomColor);
        this.side = randomSide;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}
