package core.basesyntax;

public class Square extends Figure{
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }
    String getName() {
        return Figures.SQUARE.name().toLowerCase();
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", area " + area() + " sq.units, side: "
                + side + ", color: " + getColor());
    }
}
