package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String colorFigure, int side) {
        super(colorFigure);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, 4 side: "
                + side + " units, color: " + getColorFigure());
    }
}

