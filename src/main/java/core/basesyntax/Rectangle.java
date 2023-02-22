package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(Colors color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + " color=" + getColor() + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle"
                + ", area=" + calculateArea()
                + " sq.units" + "firstLeg =" + firstLeg + " units"
                + " secondLeg = " + secondLeg
                + ", color=" + getColor());
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }
}
