package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + name() + ", Color is "
                + getColor() + " Area = " + getArea() + " side = " + side);
    }

    @Override
    public String name() {
        return String.valueOf(Figures.SQUARE);
    }
}
