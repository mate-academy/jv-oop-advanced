package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(String randomColor, double side) {
        super(randomColor);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: getArea, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
