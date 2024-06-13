package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, " + "area: " + this.getArea()
                            + " sq. units, side: " + this.side
                            + " units, color: " + super.getColor().name());
    }
}
