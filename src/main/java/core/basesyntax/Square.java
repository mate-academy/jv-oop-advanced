package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.typeOfFigure = TypeOfFigure.SQUARE;
        this.area = getQuadrangularArea(side, side);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + typeOfFigure.name()
                + ", area:  " + decimalFormat.format(area) + " sq. units, side: "
                + decimalFormat.format(side) + " units, color: " + color);
    }
}
