package core.basesyntax;

public class Square extends Figure implements FigureArea {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    @Override
    public String name() {
        return String.valueOf(Figures.SQUARE);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + name() + ", area: " + getArea()
                + " sq.units, side: " + this.side
                + " units, color: " + getColor());
    }
}
