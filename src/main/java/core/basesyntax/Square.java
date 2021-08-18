package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, int side, String color) {
        super(name, color);
        this.side = side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + this.getName()
                + ", area: " + this.getAria() + " sq.units, "
                + "color: " + this.getColor();
    }

    @Override
    public double getAria() {
        return side * side;
    }
}
