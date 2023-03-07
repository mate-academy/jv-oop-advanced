package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(side);
    }

    @Override
    public void draw() {
        double area = calcArea();
        String colorString = color.toString();

        System.out.printf("Figure: square, area: %,.2f sq.units, side: %d units, color: %s%n",
                 area, side, colorString);

    }
}
