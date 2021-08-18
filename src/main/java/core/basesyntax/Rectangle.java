package core.basesyntax;

public class Rectangle extends Figures {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super.setColor(color);
        super.setFigureType(" Rectangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double squareOfFigure() {
        return firstLeg * secondLeg;
    }

    @Override
    public String informationOfFigure() {
        return "Figure" + getType() + ", area " + squareOfFigure() + " sq.u., firstLeg "
                + firstLeg + "and secondLeg " + secondLeg + " u., color " + getColor();
    }
}
