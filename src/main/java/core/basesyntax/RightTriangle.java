package core.basesyntax;
public class RightTriangle  extends Figure{
    public double firstLeg;
    public double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public double getAriaCalculation() {
        return (firstLeg * secondLeg) / 2;
    }
    @Override
    public void drawFigure() {
        System.out.println("Figure: RightTriangle, area: " + getAriaCalculation() + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
