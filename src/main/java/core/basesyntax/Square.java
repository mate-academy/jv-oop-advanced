package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
        calcArea();
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq. units,"
                + " side: " + side + " units,"
                + " color: " + getColor();
    }

    @Override
    public void calcArea() {
        setArea(side * side);
    }
}
