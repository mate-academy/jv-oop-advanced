package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String nameFigure, int side, String colour) {
        this.setColour(colour);
        this.side = side;
        this.setNameFigure(nameFigure);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + side * side
                + " sq.units, side: " + side
                + " units, color: " + this.getColour());
    }
}
