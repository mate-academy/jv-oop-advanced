package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return (2 * firstLeg) + (2 * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle's firstLeg is " + firstLeg
                + "; secondLeg is " + secondLeg
                + "; area is " + getArea()
                + "; color is " + getColor());
    }
}
