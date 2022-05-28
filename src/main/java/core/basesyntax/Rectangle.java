package core.basesyntax;

public class Rectangle extends Figure implements GetArea, ToDrawFigure {

    public Rectangle(int firstLeg, int secondLeg, Color color) {
        this.setFirstLeg(firstLeg);
        this.setSecondLeg(secondLeg);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return getFirstLeg() * getSecondLeg();
    }

    @Override
    public String toDraw() {
        return " Figure: RightTriangle, area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor();
    }
}
