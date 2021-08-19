package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, int side, String color) {
        super(name, color);
        this.side = side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
