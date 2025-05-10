package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public String getName() {
        return Figures.SQUARE.name().toLowerCase();
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", area " + area() + " sq.units, side: "
                + side + ", color: " + getColor());
    }
}
