package core.basesyntax;

public class Rectangle extends Figure{
    public double firstLeg;
    public double height;

    public Rectangle(String color, double firstLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.height = height;
    }
    @Override
    public double getAriaCalculation() {
        return (firstLeg *  height) / 2;
    }
    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, area: " + getAriaCalculation() + " sq.units, side: " + firstLeg + " height " + height + " units, color: " + color);
    }
}
