package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Square: "
                + "sides = " + side
                + ", color = " + getColor()
                + ", area = " + areaCalculator() + '.');
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }
}
