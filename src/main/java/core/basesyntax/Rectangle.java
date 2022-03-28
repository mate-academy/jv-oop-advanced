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
    public double area() {
        return Math.rint((firstLeg * secondLeg) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area()
                + " sq.units, firs leg: " + firstLeg +" units, " + secondLeg + " units, color "
                + color);
    }
}
