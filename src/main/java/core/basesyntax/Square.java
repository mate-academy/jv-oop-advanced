package core.basesyntax;

public class Square extends Figure implements FigureArea, Draw {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getDraw() {
        return "Square, area: "
                + getArea()
                + " sq.units, "
                + "side: " + side
                + "units, "
                + "color: " + getColor();
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
