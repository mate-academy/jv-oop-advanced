package core.basesyntax;

public class Square extends Figures {
    private final int side;

    public Square(String color, int side) {
        super.setColor(color);
        super.setFigureType(" Square");
        this.side = side;

    }

    @Override
    public double squareOfFigure() {
        return Math.pow(side, 2);
    }

    @Override
    public String informationOfFigure() {
        return "Figure" + getType() + ", area " + squareOfFigure() + " sq.u., side "
                + side + " u., color " + getColor();
    }
}
