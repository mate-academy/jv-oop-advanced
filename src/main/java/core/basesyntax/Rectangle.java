package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area " + getArea()
                + "sq.units, firstLeg: " + firstLeg + "units, secondLeg:  "
                + secondLeg + "units, " + "color: " + getColor());
    }
}
