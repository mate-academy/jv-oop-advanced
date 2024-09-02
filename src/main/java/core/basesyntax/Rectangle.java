package core.basesyntax;

public class Rectangle extends Figure {
    private double leftSide;
    private double downSide;

    public Rectangle() {
    }

    public Rectangle(double leftSide, double downSide) {
        this.typeOfFigure = TypeOfFigure.RECTANGLE;
        this.area = getQuadrangularArea(leftSide, downSide);
        this.leftSide = leftSide;
        this.downSide = downSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + typeOfFigure
                + ", area: " + decimalFormat.format(area) + " sq. units, left side: "
                + decimalFormat.format(leftSide) + " units, down side: "
                + decimalFormat.format(downSide) + " units, color: " + color);
    }
}
