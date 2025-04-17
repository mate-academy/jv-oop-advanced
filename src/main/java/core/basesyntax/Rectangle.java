package core.basesyntax;

public class Rectangle extends Figure{
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int secondLeg , int firstLeg , ColorSupplier color) {
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
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
