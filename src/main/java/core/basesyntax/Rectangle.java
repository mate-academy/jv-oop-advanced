package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private String color;
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 1/2 * (firstLeg * secondLeg);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, firs leg: " + firstLeg +" units, " + secondLeg + " units, color "
                + color);
    }
}
