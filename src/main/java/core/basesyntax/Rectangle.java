package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private double area;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return area = firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg + " units ,second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
