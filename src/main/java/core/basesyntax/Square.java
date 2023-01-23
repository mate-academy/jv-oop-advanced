package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Colors color, Figures typeOfFigure,double side) {
        super(color, typeOfFigure);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getSquare()
                + " sq.units, side: " + side + " units, color: " + getColor());

    }
}

