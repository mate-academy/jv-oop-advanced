package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetArea, ToDrawFigure {

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, Color color) {
        this.setFirstLeg(firstLeg);
        this.setSecondLeg(secondLeg);
        this.setHeight(height);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        int firstLeg;
        int secondLeg;
        int height;
        return (getFirstLeg() + getSecondLeg()) / 2 * getHeight();
    }

    @Override
    public String toDraw() {
        return " Figure: IsoscelesTrapezoid, area: " + getArea()
                + "sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, height: " + getHeight()
                + " color: " + getColor();
    }
}
