package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle"
                + ", area=" + getArea()
                + " sq.units" + "firstLeg =" + firstLeg + " units"
                + " secondLeg = " + secondLeg
                + ", color=" + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
}
