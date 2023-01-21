package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", "
                + "area: " + this.getArea() + " sq.units, "
                + "firstLeg: " + this.firstLeg + " units, "
                + "secondLeg: " + this.secondLeg + " units, "
                + "color: " + this.color);
    }
}
