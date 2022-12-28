package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void PrintInfo() {
        System.out.println(" Figure: square, area:  " + getArea() + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
