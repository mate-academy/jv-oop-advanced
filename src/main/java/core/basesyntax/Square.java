package core.basesyntax;

public class Square extends Figure implements FigureArea {
    private final int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public double getAreaFigures() {
        return getArea(side * side);
    }

    public void printDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
