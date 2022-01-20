package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private String color;
    private int side;

    protected Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: square, area: " + this.getArea() + ", side: "
                + this.side + ", color: " + this.color + ".");
    }
}
