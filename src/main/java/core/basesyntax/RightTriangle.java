package core.basesyntax;

public class RightTriangle extends Figures {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super.setColor(color);
        super.setFigureType(" RightTriangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double squareOfFigure() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public String informationOfFigure() {
        return "Figure" + getType() + ", area " + squareOfFigure() + " sq.u., firstLeg "
                + firstLeg + " and secondLeg " + secondLeg + " u., color " + getColor();
    }
}
