package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Draw {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: square, side = " + side
                + ", area = " + getArea() + ", color: " + getRandomColor());

    }
}
